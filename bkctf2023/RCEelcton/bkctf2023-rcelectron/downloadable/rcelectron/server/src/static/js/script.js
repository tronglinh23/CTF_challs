window.addEventListener('load', function () {
    if (ipcRender != null) {
        ipcRender.send("showNotiIpc", "Welcome to BKSECCTF!!")
    }
})