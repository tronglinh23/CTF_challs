var WSB;(function(n){var t=/[0-9a-zA-Z]/,i=/\s+/g,r=function(){function r(t){var i=this;this._accessTokenManager=t;n.Host.bindAccessTokenAvailable(function(n){i.getProfilePictureToken(n,function(){})})}return r.prototype.getProfilePictureToken=function(t,i){this._accessTokenManager.getAccount(t,t==1?"https://outlook.office.com/":n.config.useCobaltCSS?"https://outlook.office.com/M365.Access":"https://outlook.office.com/User.ReadWrite",!1,!0,function(n){return i(n?n.Token:null)},undefined,n.Host.isAuthInvestigation()?["SubstrateProfilePictureProvider::getProfilePictureToken"]:undefined)},r.prototype.getProfilePictureIconInternal=function(t,i,r,u){return n.Async.safeChainWithGlobalCaching("getProfilePictureIcon",function(){return ThresholdUtilities.createPromise(function(u){return t(function(t){var f,o,s,e;if(!t){u(null);return}f=SearchAppWrapper.CortanaApp.createStringMap();o=SearchAppWrapper.CortanaApp.createStringMap();f.Authorization="Bearer "+t;i==0&&(f["X-AnchorMailbox"]=r);e=0;_w.BingAtWork&&_w.BingAtWork.wsb&&_w.BingAtWork.wsb.gccRegion===2&&(e=2);s=e===2?i==1?"https://substrate.office365.us/api/v2.0/Users('"+r+"')/photo/$value":"https://substrate.office365.us/imageB2/v1.0/users/"+r+"/image/$value":i==1?"https://substrate.office.com/api/v2.0/Users('"+r+"')/photo/$value":"https://substrate.office.com/imageB2/v1.0/users/"+r+"/image/$value";n.Async.safeChain("getProfilePictureIcon",function(){return SearchAppWrapper.CortanaApp.makeHttpRequestAsync(0,s,f,"",o)},function(t){if(t.statusCode!==200){u(null);return}n.Async.safeChain("getProfilePictureIcon",function(){return t.readAsStreamAsync()},u,function(){return u(null)})},function(){return u(null)},null,null,0)})})},function(){return r+"_icon"},function(t){var i=n.toIcon(t,"getProfilePictureIcon",u);return i&&(i.className="peopleIcon"),i},u)},r.prototype.getProfilePictureIconForToken=function(n,t,i,r){return this.getProfilePictureIconInternal(function(n){return n(t)},n,i,r)},r.prototype.getProfilePictureIcon=function(n,t,i){var r=this;return this.getProfilePictureIconInternal(function(t){return r.getProfilePictureToken(n,t)},n,t,i)},r.prototype.getPersonDefaultIcon=function(n){var r,u=n.trim().replace(i," ").split(" ",2),f,e;return u.length>0&&(f=u[0][0],t.test(f)&&(r=f),u.length==2&&(e=u[1][0],r&&t.test(e)?r+=e:r="")),{type:r?5:2,content:r?r.toUpperCase():"&#xE77B",className:"peopleIcon"}},r}();n.SubstrateProfilePictureProvider=r})(WSB||(WSB={}))