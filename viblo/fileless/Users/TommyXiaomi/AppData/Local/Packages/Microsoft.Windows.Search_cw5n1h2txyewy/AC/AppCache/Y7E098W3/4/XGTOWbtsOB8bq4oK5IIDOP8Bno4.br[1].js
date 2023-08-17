var WSB;(function(n){var i="AnaheimResetDefaultUpsell",r="AnaheimResetDefaultUpsellDismissed",u="AnaheimResetDefaultResultUpsellFail",f="AnaheimResetDefaultResultUpsellSuccess",t=864e5,e=function(){function e(t){var i=this;this._page=t;n.config.forceEdgeUpsell&&n.LightweightStorage.removeItem(r);n.Host.bindShown(function(){i.checkCanShowUpsell()});this._uriLaunches=0}return e.prototype.checkCanShowUpsell=function(){var t=this.updateEdgeBarUpsellState();n.isConsumerWindowsSKU()&&!n.isMsbEnterprise()?(n.shouldEnableAnaheimResetDefault()&&(n.LightweightStorage.getItem(r)=="1"||this._uriLaunches>2?n.canShowUpsell=!1:n.LightweightStorage.getItem(i)?(n.canShowUpsell=!0,n.LightweightStorage.setItem("EdgeBarUpsellDate",Date.now().toString()),this._currentUpsell=1):n.config.forceEdgeUpsell||n.Host.getDefaultBrowser()!=4&&n.Host.getDefaultBrowser()!=0?(n.canShowUpsell=!0,this._currentUpsell=0):n.canShowUpsell=!1),n.canShowUpsell||t!=1&&t!=3||(this._currentUpsell=2,n.canShowUpsell=!0)):n.canShowUpsell=!1},e.prototype.updateEdgeBarUpsellState=function(){if(!n.config.showEdgeBarUpsell||!n.isConsumerWindowsSKU())return 4;var i=+n.LightweightStorage.getItem("EdgeBarUpsellState"),r=+n.LightweightStorage.getItem("EdgeBarUpsellDate");switch(i){case 0:(r==0||Date.now()-r>t)&&(i++,n.LightweightStorage.setItem("EdgeBarUpsellDate",Date.now().toString()));break;case 1:Date.now()-r>3*t&&i++;break;case 2:Date.now()-r>7*t&&i++;n.LightweightStorage.setItem("EdgeBarUpsellDate",Date.now().toString());break;case 3:Date.now()-r>3*t&&i++}return n.LightweightStorage.setItem("EdgeBarUpsellState",i.toString()),i},e.prototype.getUpsellSyntheticSuggestion=function(t,i){return t&&(n.RuntimeConfig.QfMode===1||n.RuntimeConfig.QfMode===0)&&n.canShowSearchHomeUpsell(t)?this.createSHUpsellSuggestion(t,i):null},e.prototype.createSyntheticSuggestion=function(t,r){var e,o;if(this._currentUpsell==0)n.LightweightStorage.removeItem(f),n.LightweightStorage.removeItem(u),e=n.getSyntheticSuggestion(t,r,"EUP",{type:2,content:"&#xE713"},2,null,!1,this.getAnaheimSetDefaultAction()),e.staticGroupType=n.GroupType.Upsell,e.template=3,e.text=n.Host.getLocString(n.config.anaheimResetDefaultTitleString),e.additionalInfoText=n.Host.getLocString(n.config.anaheimResetDefaultDescString),e.additionalCalloutText=n.Host.getLocString("EdgeUpsellResetDefaultButton"),e.tooltip=n.Host.getLocString("AnaheimResetDefaultTooltip"),e.narratorText=n.Host.getLocString(n.config.anaheimResetDefaultTitleString)+n.Host.getLocString("EdgeUpsellResetDefaultButton"),e.classNames=["upsellSugg"];else if(this._currentUpsell==1)if(n.Host.getDefaultBrowser()!=4||n.LightweightStorage.getItem(f)){if(!n.LightweightStorage.getItem(u)){var h=n.InstrumentedItem.getNonSuggestionInstrumentedItem("EDUR",n.SyntheticQSCodesMaps.KValues),s=n.Host.getLocString("EdgeUpsellResetDefaultButtonFail"),c={id:"anaheimResetDefaultFailBtn",selected:!1,text:s,title:s,instItem:h,click:this.getAnaheimSetDefaultAction(),layout:0,isSelectable:!0};this._page.showTemporaryMessage(n.Host.getLocString("AnaheimResetDefaultFail"),{type:0,className:"resetDefaultResultErrorIcon"},"messageActionBtn",c);n.LightweightStorage.setItem(u,"1");n.InstrumentationHelper.logClientInstEvent("Select","EdgeUpsellResetDefaultResultError",r,{currentBrowser:n.Host.getDefaultBrowser().toString()})}}else n.LightweightStorage.removeItem(i),o=n.Host.getWindowsTheme()==2?"resetDefaultResultSuccessDarkIcon":"resetDefaultResultSuccessIcon",this._page.showTemporaryMessage(n.Host.getLocString("AnaheimResetDefaultSuccess"),{type:0,className:o}),n.LightweightStorage.setItem(f,"1"),n.InstrumentationHelper.logClientInstEvent("Select","EdgeUpsellResetDefaultResultSuccess",r);else this._currentUpsell==2&&(e=n.getSyntheticSuggestion(t,r,"EDBU",{type:0,className:"EdgeBarIcon"},2,null,!1,this.getEdgeBarAction()),e.staticGroupType=n.GroupType.Upsell,e.template=3,e.text=n.Host.getLocString("EdgeBarUpsellTitle"),e.additionalInfoText=n.Host.getLocString("EdgeBarUpsellText"),e.additionalCalloutText=n.Host.getLocString("EdgeBarUpsellCTA"),e.tooltip=n.Host.getLocString("EdgeBarUpsellTitle"),e.narratorText=n.Host.getLocString("EdgeBarUpsellTitle")+n.Host.getLocString("EdgeBarUpsellCTA"),e.classNames=["upsellSugg"]);return e},e.prototype.getEdgeBarAction=function(){var t=this;return function(){n.LightweightStorage.setItem("EdgeBarUpsellState",4..toString());t._uriLaunches++;n.InstrumentationHelper.logClientInstEvent("Select","EdgeBarUpsellClick",n.SequenceNumberManager.getSequenceNumber(),{currentBrowser:n.Host.getDefaultBrowser().toString(),uriLaunches:t._uriLaunches.toString()});n.Host.launchUri("microsoft-edge:?ux=webwidget&wwl=1&wws=1&campaign=WSBWWU&url=https://ntp.msn.com/web-widget?form=M@000P&OCID=M@000P",!1)}},e.prototype.getAnaheimSetDefaultAction=function(){var t=this;return function(){n.LightweightStorage.setItem(i,n.getCurrentTime().toString());t._uriLaunches++;var r=n.config.anaheimUpsellDefaultLaunchURI.replace("{0}",n.config.anaheimResetDefaultURIFormCode);n.InstrumentationHelper.logClientInstEvent("Select","EdgeUpsellResetDefaultCall",n.SequenceNumberManager.getSequenceNumber(),{currentBrowser:n.Host.getDefaultBrowser().toString(),uriLaunches:t._uriLaunches.toString()});n.Host.launchUri(r,!1)}},e.prototype.createSHUpsellSuggestion=function(n,t){return this.createSyntheticSuggestion(n,t)},e.prototype.getDismissButtonAction=function(){return this._currentUpsell==0?function(){n.canShowUpsell=!1;n.LightweightStorage.setItem(r,"1");n.Host.refreshCurrentPane();n.InstrumentationHelper.logClientInstEvent("Select","EdgeUpsellResetResultDismiss",null)}:this._currentUpsell==2?function(){n.canShowUpsell=!1;n.LightweightStorage.setItem("EdgeBarUpsellDate",Date.now().toString());var t=+n.LightweightStorage.getItem("EdgeBarUpsellState");t==1?n.LightweightStorage.setItem("EdgeBarUpsellState",2..toString()):n.LightweightStorage.setItem("EdgeBarUpsellState",4..toString());n.Host.refreshCurrentPane();n.InstrumentationHelper.logClientInstEvent("Select","EdgeBarUpsellDismiss",null)}:function(){n.canShowUpsell=!1}},e}();n.UpsellViewModel=e})(WSB||(WSB={}))