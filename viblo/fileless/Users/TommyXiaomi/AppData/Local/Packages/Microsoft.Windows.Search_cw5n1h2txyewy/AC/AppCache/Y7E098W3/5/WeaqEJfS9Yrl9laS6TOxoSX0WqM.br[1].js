var __extends=this&&this.__extends||function(){var n=function(t,i){return n=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(n,t){n.__proto__=t}||function(n,t){for(var i in t)Object.prototype.hasOwnProperty.call(t,i)&&(n[i]=t[i])},n(t,i)};return function(t,i){function r(){this.constructor=t}if(typeof i!="function"&&i!==null)throw new TypeError("Class extends value "+String(i)+" is not a constructor or null");n(t,i);t.prototype=i===null?Object.create(i):(r.prototype=i.prototype,new r)}}(),WSB;(function(n){var t;(function(t){var i=60,r=function(r){function u(){return r!==null&&r.apply(this,arguments)||this}return __extends(u,r),u.prototype.componentDidUpdate=function(){var r=this,i=this.props.dataModel,t;i&&i.innerHtml&&(t=this.refs.flyoutIframe,t.contentWindow.focus(),t.contentDocument.open(),t.contentWindow.history.replaceState(undefined,"",i.flyoutUrl),t.contentDocument.write(i.innerHtml),t.contentDocument.close(),(n.MockUrlParameters===null||n.MockUrlParameters===void 0?void 0:n.MockUrlParameters.isTest)&&this.displayContent(t),t.contentDocument.body.onload=function(){r.displayContent(t)},t.contentWindow.open=function(t){var r=n.getCurrentTime();return i.launchUri(t,r,0),null},t.contentDocument.body.onclick=function(t){for(var r=t.target,u;r&&!r.href;)r=r.parentNode;if(r)return u=n.getCurrentTime(),i.launchUri(r.href,u,n.getInputType(t)),t.preventDefault()},i.onBlur&&(t.contentWindow.onblur=i.onBlur))},u.prototype.displayContent=function(n){var t=this.refs.rewardsFlyout,r=window.innerHeight?window.innerHeight-i:600;t.style.height="".concat(Math.min(n.contentWindow.document.body.scrollHeight,600,r-24),"px");t.classList.add("loadedFlyout")},u.prototype.render=function(){var n=this.props.dataModel;return n?React.createElement("div",{id:"rewardsFlyout",ref:"rewardsFlyout"},n.loadingText&&React.createElement("p",null,n.loadingText),React.createElement("iframe",{ref:"flyoutIframe","data-partnertag":t.whenTestHooks("AutoSuggest.RewardsFlyout")})):null},u}(React.Component);t.RewardsFlyout=r})(t=n.View||(n.View={}))})(WSB||(WSB={}))