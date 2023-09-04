// Modules to control application life and create native browser window
const {
  session,
  app,
  BrowserWindow,
  ipcMain,
  screen
} = require('electron')
const path = require('path')
let notificationWindow = null;
let mainWindow = null;

function createWindow() {
  // Create the browser window.
  mainWindow = new BrowserWindow({
    width: 800,
    height: 600,
    webPreferences: {
      preload: path.join(__dirname, 'preload.js')
    }
  })

  // Load TICKET_ID and COOKIE if it set in ENV
  let TICKET_ID = process.env.TICKET_ID
  let url = process.env.BASE_URL || "http://server:5000"
  let cookie_env = process.env.COOKIE

  if (TICKET_ID) {
    url += `/ticket/${TICKET_ID}`
  }
  if (cookie_env) {
    let cookie = {
      url: url,
      name: 'session',
      value: cookie_env
    }
    session.defaultSession.cookies.set(cookie)
      .then(() => {
        console.log(`[+] Set Cookie: ${cookie_env} to ${url}`)
      }, (error) => {
        console.error(error)
      })
  }
  mainWindow.loadURL(url)
  // After main window, we create notification window
}

ipcMain.on('requireNotiIpc', (event, message) => {
  if (notificationWindow != null && message != null) {
    notificationWindow.webContents.send("RemoteRequireIpc", message)
  }
})

// IPC handler in the main window
ipcMain.on('showNotiIpc', (event, message) => {
  if (notificationWindow != null) {
    notificationWindow.show()
    try {
      notificationWindow.webContents.executeJavaScript(`loadMessage('${message}')`, true, (result) => {
      });
    } catch (e) {
      // console.log(e)
    } finally {
      setTimeout(() => {
        notificationWindow.hide() // Hide the window when done
      }, 3000)
    }
  }
});


function createNotificationWindow() {
  const {
    width,
    height
  } = screen.getPrimaryDisplay().workAreaSize; // Get the screen dimensions
  const windowWidth = 300;
  const windowHeight = 150;
  const x = width - windowWidth; // Desired X position from the left
  const y = height - windowHeight; // Desired Y position from the bottom

  notificationFolder = path.join(__dirname, "notification")

  notificationWindow = new BrowserWindow({
    width: windowWidth,
    height: windowHeight,
    x: x,
    y: y,
    show: false,
    frame: false,
    resizable: false,
    alwaysOnTop: true,
    webPreferences: {
      nodeIntegration :true,
      sandbox: false,
      contextIsolation: false,
      preload: path.join(notificationFolder, 'notification-preload.js')
    }
  });

  notificationWindow.loadFile(path.join(notificationFolder, 'notification.html'));

}


app.whenReady().then(() => {
  // console.log("App is running")
  createWindow()
  if (notificationWindow == null) createNotificationWindow()

  app.on('activate', function () {
    // On macOS it's common to re-create a window in the app when the
    // dock icon is clicked and there are no other windows open.
    if (BrowserWindow.getAllWindows().length === 0) createWindow()

    if (notificationWindow == null) createNotificationWindow()
  })
})

// Quit when all windows are closed, except on macOS. There, it's common
// for applications and their menu bar to stay active until the user quits
// explicitly with Cmd + Q.
app.on('window-all-closed', function () {
  if (process.platform !== 'darwin') app.quit()
})