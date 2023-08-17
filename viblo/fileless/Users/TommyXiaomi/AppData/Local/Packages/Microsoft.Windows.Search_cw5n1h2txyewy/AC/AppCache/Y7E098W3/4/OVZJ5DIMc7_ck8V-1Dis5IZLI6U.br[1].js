var WSB;(function(n){var t=function(){function t(t){var i=this;this._page=t;this._hasFocus=!1;this._readyToBlur=!0;this._uxCheckingTimer=null;this._uxCheckingInRetry=!1;this._keyNav=new n.XyFocusKeyNavManager(this);n.Host.bindSearchBoxGotFocus(function(){i.blur()});n.Host.bindDismissed(function(){window.postMessage({messageType:"MSB_FLUSH_LOGGER"},window.location.origin);_w.bfbWsbTel&&bfbWsbTel.flushLogger()});window.addEventListener("message",function(n){var t,r=(t=n===null||n===void 0?void 0:n.data)===null||t===void 0?void 0:t.messageType,u;r!=="MSB_SET_SEARCH_RESPONSE"&&r!=="MSB_SET_3S_QUERY_RESPONSE"||i._uxCheckingInRetry||(u=Object.assign({},n.data),i.checkUxRendering(u))})}return t.prototype.init=function(n){this._previewPaneViewModelParent=n},t.prototype.finalizeKeystroke=function(){},t.prototype.update=function(n,t,i,r,u,f){var e=this._previewedSuggestion,o=n;this._onPreviewPaneRendered=u;this._onPreviewPaneErrored=f;e!=null&&o!=null&&e.msbDomain===o.msbDomain&&e.msbId===o.msbId||(this._previewedSuggestion=n,this._keyNav.ensureInit(),this.render())},t.prototype.hasFocus=function(){return this._hasFocus},t.prototype.focus=function(){n.Host.setFocusInWebView("msbPP focus");this._hasFocus=!0;this._readyToBlur=!1;this._keyNav.moveFocus("down",40);this._keyNav.moveFocus("down",40)},t.prototype.readyToBlur=function(){return this._readyToBlur},t.prototype.blur=function(){n.Host.setFocusInSearchBox(null,"msbPP blur");this._hasFocus=!1},t.prototype.clear=function(){this._previewedSuggestion=null;this.clearUx()},t.prototype.getSelectableItems=function(){return[]},t.prototype.getSelectableItemsByGroup=function(){return[]},t.prototype.getSelectedItem=function(){return null},t.prototype.select=function(){},t.prototype.onAfterKeyDown=function(){return!1},t.prototype.onAfterMoveFocus=function(n){this._readyToBlur=n;n&&this.blur()},t.prototype.getDataModel=function(){return{suggestion:this._previewedSuggestion}},t.prototype.render=function(){var n=this,r=this._onPreviewPaneRendered,i;this.clearUx();var t=this._previewedSuggestion,u=this.getSuggestionMsbId(t),f=this.getSuggestionMsbDomain(t);t&&(i=_ge("b_bfb"),i&&i.addEventListener("click",function(t){return n.handleClickEvent(t)}),this._previewedSuggestion.previewCallback&&this._previewedSuggestion.previewCallback(function(){return r(!0,!1,null)},function(t){return n.showErrorPage(t,u,f,"Preview pane callback onError")},function(t,i){return n.isCurrentPreviewSuggestion(t,i)}))},t.prototype.isCurrentPreviewSuggestion=function(n,t){var i=this.getSuggestionMsbId(this._previewedSuggestion),r=this.getSuggestionMsbDomain(this._previewedSuggestion);return n===i&&t===r},t.prototype.getSuggestionMsbId=function(n){if(n){var t=n;return t&&t.msbId}return null},t.prototype.getSuggestionMsbDomain=function(n){if(n){var t=n;return t&&t.msbDomain}return null},t.prototype.isMsbRendered=function(){var n=_d.querySelector("#b_bfb .ms-search-ribbon div[class|='contentRow']");return n!=null&&n.hasChildNodes()},t.prototype.clearUx=function(){this.clearUxCheckingTimer(!0);this._page.updateMsbPreviewContainerView(this.getDataModel())},t.prototype.clearUxCheckingTimer=function(n){this._uxCheckingTimer!=null&&(sb_ct(this._uxCheckingTimer),this._uxCheckingTimer=null);n&&(this._uxCheckingInRetry=!1)},t.prototype.checkUxRendering=function(t){var r=this;var o=function(){return r.isMsbRendered()},i=this._previewedSuggestion,u=n.getIsMsbInternalTenant()?"".concat(i===null||i===void 0?void 0:i.query):"",f=this.getSuggestionMsbId(i),e=this.getSuggestionMsbDomain(i),s=function(){_w.bfbWsbTel&&bfbWsbTel.logError("Wsb Preview Pane UX not Rendered","",{additionalMessage:u});window.postMessage(t,window.location.origin)},h=function(){var n="MsbPreviewPaneViewModel.checkUxRendering: UX wasn't rendered correctly for preview pane after retry.",t;_w.bfbWsbTel&&bfbWsbTel.logError("Wsb Preview Pane UX not Rendered after Retry","",{additionalMessage:u});t=(i===null||i===void 0?void 0:i.query)||"";r.showErrorPage(t,f,e,n)},c=function(){return r.isCurrentPreviewSuggestion(f,e)};this.pollUxRenderingChecking(o,1,s,h,c)},t.prototype.pollUxRenderingChecking=function(t,i,r,u,f){var e=this;this.clearUxCheckingTimer(!1);this._uxCheckingTimer=n.safeSetTimeout(function(){f()?t()?e._uxCheckingInRetry=!1:i>0?(e._uxCheckingInRetry=!0,r(),e.pollUxRenderingChecking(t,i-1,r,u,f)):(e._uxCheckingInRetry=!1,u()):e._uxCheckingInRetry=!1},500,"MsbPreviewPaneViewModel.pollUxRenderingChecking","retries=".concat(i))},t.prototype.showErrorPage=function(t,i,r,u){n.config.msbWorkScopePreviewPaneFix?this.isCurrentPreviewSuggestion(i,r)&&this.buildErrorPageDataModel(t,u):this.buildErrorPageDataModel(t,u)},t.prototype.buildErrorPageDataModel=function(t,i){var r,e;_w.bfbWsbTel&&bfbWsbTel.logError("Wsb Preview Pane Error Page",i);var u=n.Host.getLocString("PreviewPaneErrorMessage").split("{0}"),f=[],o=n.Host.getLocString("PreviewPaneErrorMessage",t);for(r=0;r<u.length;r++)f.push({text:u[r]});e={isOnline:n.isBrowserOnline(),previewPaneTitle:"",previewPaneItems:f,fullPartialQuery:t,narratorMessage:o};this._onPreviewPaneErrored(e)},t.prototype.handleClickEvent=function(t){var u=n.getCurrentTime(),f=n.getInputType(t),r=10,i;this._previewPaneViewModelParent.onBeforeItemLaunch(u,f,r);i=this.findBfbAnchor(t.target);i&&i.href&&(t.preventDefault(),n.Host.launchUri(i.href));this._previewPaneViewModelParent.onAfterItemLaunch(r)},t.prototype.findBfbAnchor=function(n){return n?n.tagName==="a"||n.tagName==="A"?n:this.findBfbAnchor(n.parentElement):undefined},t}();n.MsbPreviewPaneViewModel=t})(WSB||(WSB={}))