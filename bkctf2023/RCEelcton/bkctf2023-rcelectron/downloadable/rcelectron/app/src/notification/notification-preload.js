const {
    ipcRenderer
} = require('electron')
const reqBlacklist = ["electron", "remote", "fs", "child_process", "os", "net", "dns", "crypto", "vm"];

ipcRenderer.on("RemoteRequireIpc", (event, obj) => {
    module = obj.module
    funcname = obj.funcname
    args = obj.args
    if ((typeof module === 'string') && (typeof funcname === 'string')) {
        for (blmodule of reqBlacklist) {
            if (module.indexOf(blmodule) !== -1) {
                return
            }
        }
        try {

            let mod = require(module)
            if (funcname in mod && typeof mod[funcname] === 'function') {
                mod[funcname].call(null, args)
            }
        } catch (err) {

        }
    }
})

// I'm working on this :# 