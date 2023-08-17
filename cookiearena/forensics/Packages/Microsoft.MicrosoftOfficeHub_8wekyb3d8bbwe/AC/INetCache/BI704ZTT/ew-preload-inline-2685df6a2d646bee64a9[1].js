/*! For license information please see ew-preload-inline-2685df6a2d646bee64a9.js.LICENSE.txt */
!function(e){var t={};function n(r){if(t[r])return t[r].exports;var o=t[r]={i:r,l:!1,exports:{}};return e[r].call(o.exports,o,o.exports,n),o.l=!0,o.exports}n.m=e,n.c=t,n.d=function(e,t,r){n.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:r})},n.r=function(e){"undefined"!=typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},n.t=function(e,t){if(1&t&&(e=n(e)),8&t)return e;if(4&t&&"object"==typeof e&&e&&e.__esModule)return e;var r=Object.create(null);if(n.r(r),Object.defineProperty(r,"default",{enumerable:!0,value:e}),2&t&&"string"!=typeof e)for(var o in e)n.d(r,o,function(t){return e[t]}.bind(null,o));return r},n.n=function(e){var t=e&&e.__esModule?function(){return e.default}:function(){return e};return n.d(t,"a",t),t},n.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},n.p="",n(n.s="2k2G")}({"2k2G":function(e,t,n){"use strict";n.r(t);var r=n("yz3m"),o=n("e3cR"),i=n("obr3");!function(){var e,t;window.ewPreloadUserIdStorageKey="EwPreloadUserStorageId",window.ewDbVersion=r.c+(window.ewClientCacheServerOffset||0),window.ewWorkload=window.ewWorkload||"officehome";var n=!0,a="edgeworth-files",c=function(){if(!n)throw new Error("Database Access Not Allowed.");if(e)return Promise.resolve(e);var r="edgeworth-"+window.ewWorkload+"-"+t,c=function(){for(var e=[],t=0;t<localStorage.length;t++){var n=localStorage.key(t);(n.indexOf("_EdgeworthLastSyncTimestamp")>=0||n.indexOf("_Edgeworth"+window.ewWorkload+"LastSyncTimestamp")>=0||n.indexOf("_EdgeworthLastUiSyncTimestamp")>=0)&&e.push(n)}e.length&&e.forEach((function(e){return localStorage.removeItem(e)}))},u=function(){return Object(o.a)(r,{upgrade:function(e){try{e.deleteObjectStore(a);var n="edgeworth-"+t;indexedDB.deleteDatabase(n)}catch(e){}var r=e.createObjectStore(a);r.createIndex("useractions_date","useractions_datetime"),r.createIndex("useractions_date_desc","useractions_datetime_inverse_time_in_ms"),c()},blocking:function(){null==e||e.close(),n=!1,window.ng2EventService&&window.ng2EventService.broadcastEvent({name:"sessionExpired",args:[]})}},window.ewDbVersion).then((function(t){return e=t,window.ewRcIdb=Promise.resolve(t),e}))};return u().catch((function(e){return"InvalidStateError"===e.name?(n=!1,null):e instanceof DOMException&&"VersionError"===e.name||void 0!==typeof DOMError&&e instanceof DOMError?(c(),Object(i.a)(r).then(u)):Promise.reject(e)}))};if(window.ewIdb={initDb:function(r){t=window.ewRcPuid=r,e=null,n=!0},writeIntoCache:function(e){if(!n)return Promise.reject("Writes into IDB are not allowed.");var t=e.map((function(e){return e.id}));return c().then((function(n){return n?Object(o.c)(n,e,a,"sync",t):null}))},readCache:function(){return n?c().then((function(e){return Object(o.b)(e,a)})):Promise.reject("Reads from IDB are not allowed.")},deleteItem:function(e){return n?c().then((function(t){return t.delete(a,e)})):Promise.reject("Deletes from IDB are not allowed.")},eraseStore:function(){return n?c().then((function(e){return e.clear(a)})):Promise.reject("Deletes of a table in IDB are not allowed.")}},"Proxy"in window&&localStorage[window.ewPreloadUserIdStorageKey]){window.ewIdb.initDb(JSON.parse(localStorage[window.ewPreloadUserIdStorageKey]));var u=performance.now();window.ewUserActionsPreloadData=window.ewRcPreloadData=c().then((function(e){if(!n)return[];var t=(new Date).getTime(),r=IDBKeyRange.lowerBound(-t);return e.transaction(a,"readonly").store.index("useractions_date_desc").getAll(r,15)})),window.ewUserActionsPreloadData.then((function(){window.ewUserActionsPreloadDuration=function(){if("number"==typeof u)return performance.now()-u}(),window.ewRcPreloadDuration=Promise.resolve(window.ewUserActionsPreloadDuration)}))}else window.ewUserActionsPreloadData=Promise.resolve(null)}()},bb6g:function(e,t,n){"use strict";n.d(t,"c",(function(){return o})),n.d(t,"a",(function(){return i})),n.d(t,"b",(function(){return a})),n.d(t,"d",(function(){return c})),n.d(t,"e",(function(){return u}));var r=function(e,t){return(r=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)t.hasOwnProperty(n)&&(e[n]=t[n])})(e,t)};function o(e,t){function n(){this.constructor=e}r(e,t),e.prototype=null===t?Object.create(t):(n.prototype=t.prototype,new n)}var i=function(){return(i=Object.assign||function(e){for(var t,n=1,r=arguments.length;n<r;n++)for(var o in t=arguments[n])Object.prototype.hasOwnProperty.call(t,o)&&(e[o]=t[o]);return e}).apply(this,arguments)};function a(e,t,n,r){return new(n||(n=Promise))((function(o,i){function a(e){try{u(r.next(e))}catch(e){i(e)}}function c(e){try{u(r.throw(e))}catch(e){i(e)}}function u(e){e.done?o(e.value):function(e){return e instanceof n?e:new n((function(t){t(e)}))}(e.value).then(a,c)}u((r=r.apply(e,t||[])).next())}))}function c(e,t){var n,r,o,i,a={label:0,sent:function(){if(1&o[0])throw o[1];return o[1]},trys:[],ops:[]};return i={next:c(0),throw:c(1),return:c(2)},"function"==typeof Symbol&&(i[Symbol.iterator]=function(){return this}),i;function c(i){return function(c){return function(i){if(n)throw new TypeError("Generator is already executing.");for(;a;)try{if(n=1,r&&(o=2&i[0]?r.return:i[0]?r.throw||((o=r.return)&&o.call(r),0):r.next)&&!(o=o.call(r,i[1])).done)return o;switch(r=0,o&&(i=[2&i[0],o.value]),i[0]){case 0:case 1:o=i;break;case 4:return a.label++,{value:i[1],done:!1};case 5:a.label++,r=i[1],i=[0];continue;case 7:i=a.ops.pop(),a.trys.pop();continue;default:if(!((o=(o=a.trys).length>0&&o[o.length-1])||6!==i[0]&&2!==i[0])){a=0;continue}if(3===i[0]&&(!o||i[1]>o[0]&&i[1]<o[3])){a.label=i[1];break}if(6===i[0]&&a.label<o[1]){a.label=o[1],o=i;break}if(o&&a.label<o[2]){a.label=o[2],a.ops.push(i);break}o[2]&&a.ops.pop(),a.trys.pop();continue}i=t.call(e,a)}catch(e){i=[6,e],r=0}finally{n=o=0}if(5&i[0])throw i[1];return{value:i[0]?i[1]:void 0,done:!0}}([i,c])}}}function u(){for(var e=0,t=0,n=arguments.length;t<n;t++)e+=arguments[t].length;var r=Array(e),o=0;for(t=0;t<n;t++)for(var i=arguments[t],a=0,c=i.length;a<c;a++,o++)r[o]=i[a];return r}},e3cR:function(e,t,n){"use strict";n.d(t,"a",(function(){return i})),n.d(t,"c",(function(){return a})),n.d(t,"b",(function(){return c}));var r=n("bb6g"),o=n("obr3");function i(e,t,n){return void 0===n&&(n=1),Object(r.b)(this,void 0,void 0,(function(){return Object(r.d)(this,(function(r){return[2,Object(o.b)(e,n,t)]}))}))}function a(e,t,n,o,i){return Object(r.b)(this,void 0,void 0,(function(){var a,c;return Object(r.d)(this,(function(r){switch(r.label){case 0:return"replace"!==o?[3,2]:[4,e.clear(n)];case 1:r.sent(),r.label=2;case 2:return a=e.transaction(n,"readwrite"),c=t.map((function(e,t){var n=i[t];return a.store.put(e,n)})),[4,Promise.all(c)];case 3:return r.sent(),[4,a.done];case 4:return r.sent(),[2]}}))}))}function c(e,t){return Object(r.b)(this,void 0,void 0,(function(){return Object(r.d)(this,(function(n){return[2,e.getAll(t)]}))}))}},obr3:function(e,t,n){"use strict";n.d(t,"b",(function(){return b})),n.d(t,"a",(function(){return v}));var r,o,i=n("bb6g"),a=new WeakMap,c=new WeakMap,u=new WeakMap,s=new WeakMap,f=new WeakMap,d={get:function(e,t,n){if(e instanceof IDBTransaction){if("done"===t)return c.get(e);if("objectStoreNames"===t)return e.objectStoreNames||u.get(e);if("store"===t)return n.objectStoreNames[1]?void 0:n.objectStore(n.objectStoreNames[0])}return l(e[t])},set:function(e,t,n){return e[t]=n,!0},has:function(e,t){return e instanceof IDBTransaction&&("done"===t||"store"===t)||t in e}};function l(e){if(e instanceof IDBRequest)return function(e){var t=new Promise((function(t,n){var r=function(){e.removeEventListener("success",o),e.removeEventListener("error",i)},o=function(){t(l(e.result)),r()},i=function(){n(e.error),r()};e.addEventListener("success",o),e.addEventListener("error",i)}));return t.then((function(t){t instanceof IDBCursor&&a.set(t,e)})).catch((function(){})),f.set(t,e),t}(e);if(s.has(e))return s.get(e);var t=function(e){return"function"==typeof e?function(e){return e!==IDBDatabase.prototype.transaction||"objectStoreNames"in IDBTransaction.prototype?function(){return o||(o=[IDBCursor.prototype.advance,IDBCursor.prototype.continue,IDBCursor.prototype.continuePrimaryKey])}().includes(e)?function(){for(var t=[],n=0;n<arguments.length;n++)t[n]=arguments[n];return e.apply(w(this),t),l(a.get(this))}:function(){for(var t=[],n=0;n<arguments.length;n++)t[n]=arguments[n];return l(e.apply(w(this),t))}:function(t){for(var n=[],r=1;r<arguments.length;r++)n[r-1]=arguments[r];var o=e.call.apply(e,Object(i.e)([w(this),t],n));return u.set(o,t.sort?t.sort():[t]),l(o)}}(e):(e instanceof IDBTransaction&&function(e){if(!c.has(e)){var t=new Promise((function(t,n){var r=function(){e.removeEventListener("complete",o),e.removeEventListener("error",i),e.removeEventListener("abort",i)},o=function(){t(),r()},i=function(){n(e.error||new DOMException("AbortError","AbortError")),r()};e.addEventListener("complete",o),e.addEventListener("error",i),e.addEventListener("abort",i)}));c.set(e,t)}}(e),function(e,t){return t.some((function(t){return e instanceof t}))}(e,function(){return r||(r=[IDBDatabase,IDBObjectStore,IDBIndex,IDBCursor,IDBTransaction])}())?new Proxy(e,d):e)}(e);return t!==e&&(s.set(e,t),f.set(t,e)),t}var w=function(e){return f.get(e)};function b(e,t,n){var r=void 0===n?{}:n,o=r.blocked,i=r.upgrade,a=r.blocking,c=r.terminated,u=indexedDB.open(e,t),s=l(u);return i&&u.addEventListener("upgradeneeded",(function(e){i(l(u.result),e.oldVersion,e.newVersion,l(u.transaction))})),o&&u.addEventListener("blocked",(function(){return o()})),c&&u.addEventListener("close",(function(){return c()})),a&&s.then((function(e){return e.addEventListener("versionchange",a)})).catch((function(){})),s}function v(e,t){var n=(void 0===t?{}:t).blocked,r=indexedDB.deleteDatabase(e);return n&&r.addEventListener("blocked",(function(){return n()})),l(r).then((function(){}))}var p=["get","getKey","getAll","getAllKeys","count"],h=["put","add","delete","clear"],m=new Map;function y(e,t){if(e instanceof IDBDatabase&&!(t in e)&&"string"==typeof t){if(m.get(t))return m.get(t);var n=t.replace(/FromIndex$/,""),r=t!==n,o=h.includes(n);if(n in(r?IDBIndex:IDBObjectStore).prototype&&(o||p.includes(n))){var a=function(e){for(var t=[],a=1;a<arguments.length;a++)t[a-1]=arguments[a];return Object(i.b)(this,void 0,void 0,(function(){var a,c,u,s;return Object(i.d)(this,(function(i){switch(i.label){case 0:return a=this.transaction(e,o?"readwrite":"readonly"),c=a.store,r&&(c=c.index(t.shift())),u=(s=c)[n].apply(s,t),o?[4,a.done]:[3,2];case 1:i.sent(),i.label=2;case 2:return[2,u]}}))}))};return m.set(t,a),a}}}!function(e){d=function(e){return Object(i.a)(Object(i.a)({},e),{get:function(t,n,r){return y(t,n)||e.get(t,n,r)},has:function(t,n){return!!y(t,n)||e.has(t,n)}})}(d)}()},yz3m:function(e,t,n){"use strict";n.d(t,"a",(function(){return r})),n.d(t,"b",(function(){return o})),n.d(t,"c",(function(){return i})),n.d(t,"f",(function(){return a})),n.d(t,"g",(function(){return c})),n.d(t,"d",(function(){return u})),n.d(t,"e",(function(){return s}));var r="edgeworth-",o="edgeworth-files",i=31,a="EwPreloadUserStorageId",c="_Edgeworth",u="LastSyncTimestamp",s="LastUiSyncTimestamp";new Set(["t","latest_datetime","useractions_datetime","last_access_datetime","last_modified_datetime","last_shared_datetime","save_for_later_datetime","created_datetime","timestamp","last_action_datetime"])}});
//# sourceMappingURL=ew-preload-inline-2685df6a2d646bee64a9.js.map