var WSB;(function(n){function e(t){return(t==="SSUE"||t==="SREE")&&n.isDocSourceEnabledInQws(t)}function p(n,t){var i,r;switch(t){case"SSUE":return((i=n===null||n===void 0?void 0:n.Groups)===null||i===void 0?void 0:i.length)>0;case"SREE":return((r=n===null||n===void 0?void 0:n.EntitySets)===null||r===void 0?void 0:r.length)>0;default:return!1}}const i="NT",b="NF",k="TO",o="SubstrateSearchService",d="https://outlook.office365.com/autodiscover/autodiscover.json/v1.0/{0}?Protocol={1}",r="AutoDiscoveryKey";n.ZqSuggestionsStorageKey="3SZqSuggestionsKey";const s="gwsflt.",g="textdecorations",h="scenario",c="setflight",nt="debug",l="entitytypes",tt="1",it="scopes",rt="people.directorysearch",ut="Authorization",u="Content-Type",ft="X-AnchorMailbox",et="X-Client-Language",ot="X-Client-LocalTime",a="Client-Request-Id",v="User-Agent",st="X-Debug-ExternalExp",ht="X-Client-Flights",f="application/json",ct="WSBScopeZQ15",lt="WSBScopeZQ20",at=15,vt=6048e5,yt=n.MinuteToMs,pt=2e3;let t,y=!1;const wt="https://substrate.office.com{0}/api/v1/",bt="https://substrate.office365.us{0}/api/v1/";n.qws3SDocsEnabled=e;class w extends n.CortanaJsonDataProvider{getName(){return"SubstrateDataProvider "+this._dataSource}constructor(i,u,f,e){var o;super(e||w.getDataSource(u,f));this._accessTokenManager=i;this._authType=u;this._providerType=f;let h;if(this._autoDiscoveryData={stem:"/search",timestamp:-1},!y){y=!0;let i=[],r=n=>n.split(",").filter(n=>n.toLocaleLowerCase().startsWith(s)).map(n=>n.substr(s.length));n.TestHookUrlParameters&&i.push(...((o=n.TestHookUrlParameters===null||n.TestHookUrlParameters===void 0?void 0:n.TestHookUrlParameters["3sflights"])!==null&&o!==void 0?o:"").split(","));t=i.join(",");ThresholdUtilities.getCortanaHeaders(n=>{if(n){let u=n["X-BM-ClientFeatures"];if(u){let n=r(u);n.length>0&&(i.push(...n),t=i.join(","))}}})}(n.TestHookUrlParameters===null||n.TestHookUrlParameters===void 0?void 0:n.TestHookUrlParameters.clearAutoDCache)&&n.LightweightStorage.removeItem(r);let c=n.LightweightStorage.getItem(r);if(c){let t=n.safeExecute(()=>JSON.parse(c),"parseAutoDiscovery",null);t&&!t.errorState?this._autoDiscoveryData=t:n.LightweightStorage.removeItem(r)}n.config.msbCleanQwsDocsCache&&n.LightweightStorage.removeItem(n.ZqSuggestionsStorageKey);n.Host.bindAccountChanged(()=>{n.LightweightStorage.removeItem(n.ZqSuggestionsStorageKey)});n.Host.bindAccessTokenAvailable(t=>{if(t==this._authType){if(this._providerType==0){let t=n.getCurrentTime();if(h){let n=t-h;if(n<yt)return}h=t;this.fetchUrl(this.getSubstrateInitUrl(),null,"",()=>{},null,()=>!0)}let i=n.getCurrentDate();i.setDate(i.getDate()-1);this._autoDiscoveryData.timestamp<i.getTime()&&this.getStem()(t,t=>{t.timestamp=n.getCurrentTime(),this._autoDiscoveryData=t,t.errorState||n.LightweightStorage.setItem(r,JSON.stringify(t))})}})}createUrl(t){if(this._providerType==1||this._providerType==2)return this.getBaseUrl();if(this._providerType==0){if(t.scope==n.Scope.Documents){let i=n.getEffectiveQuery(t);if(i!=t.queryToFetch)return this.getBaseUrl()+n.encodeQueryParameter(i.toLocaleLowerCase())}return super.createUrl(t)}throw new Error("Not implemented");}getBaseUrl(){if(this._providerType==0)return this.getSubstrateSuggestionsUrl();if(this._providerType==1)return this.getSubstrateSearchUrl();if(this._providerType==2)return this.getSubstrateRecomendationsUrl();throw new Error("Not implemented");}getClientFlights(){return this._providerType==2?"recEnableDuplicateMeetingAttachments":null}static getDataSource(n,t){if(t==0)return n==1?"SSUE":"SSUC";if(t==1)return n==1?"SSEE":"SSEC";if(t==2&&n==1)return"SREE";throw new Error("Not implemented");}getPostBody(t){if(this._providerType==1){let i,r=n.getEffectiveScope(t);switch(r){case n.Scope.Emails:let u=[{Score:{SortDirection:"Desc",Count:n.config.maxNumberOfEmailsInTopResult}},{Time:{SortDirection:"Desc"}}];i=this.buildPostBodyForQueryEndpoint(t,"Message",["Exchange"],u);break;case n.Scope.Documents:case n.Scope.All:case n.Scope.Work:let r;switch(n.config.queryProvenances){case 0:r=["SharePoint"];break;case 1:r=["OneDriveBusiness"];break;case 2:r=["SharePoint","OneDriveBusiness"];break;default:throw new Error("Unexpected query provenances: "+n.config.queryProvenances);}i=this.buildPostBodyForQueryEndpoint(t,"Documents",r,[{Score:"Desc"}]);break;default:throw new Error("Unsupported scope "+t.scope);}return JSON.stringify(i)}return this._providerType==2?JSON.stringify(this.buildPostBodyForRecommendationsEndpoint(t)):""}buildPostBodyForQueryEndpoint(n,t,i,r){return this.buildPostBody(t,"WindowsSearchBoxL2",undefined,n.queryToFetch,i,r,"ProvenanceOptimized","Forward")}buildPostBodyForRecommendationsEndpoint(t){if(n.config.use3sRecRecommendedFiles&&t.isSearchHomeZI)return this.buildPostBody("Document","WSB.RecommendedFiles");let i=new Date(n.getCurrentTime()).toISOString(),r=new Date(n.getCurrentTime()+at*n.MinuteToMs).toISOString();var u=[{EntityType:"Event",StartDateTime:i,EndDateTime:r,Top:2},{EntityType:"Document",Top:10}];return this.buildPostBody("Document","WSB.MeetingRelatedEntities",u)}buildPostBody(t,i,r,u,f,e,o,s){switch(i){case"WSB.RecommendedFiles":return{EntityRequests:[{}],Cvid:n.Host.getConversationId(),Scenario:{Name:i}};default:return{EntityRequests:[{Query:u?{QueryString:u}:undefined,QueryParameters:r,EntityType:t,Provenances:f,Sort:e,PropertySet:o}],Cvid:n.Host.getConversationId(),TextDecorations:s,Scenario:{Name:i}}}}getStem(){return n.Async.safeChainWithGlobalCaching("getStem",t=>ThresholdUtilities.createPromise(r=>{this._accessTokenManager.getAccount(t,n.getSubstrateResourceOrScope(t),!1,!0,t=>{if(t&&t.UserName){let e=n.formatString(d,[t.UserName,o]),i={};i[u]=f;i[a]=n.Host.getConversationId();i[v]=navigator.userAgent;let s=(t,i,u)=>{if(u){r({stem:"",errorState:u});return}let f=i;if(!f){r({stem:""});return}if(!f.Url){r({stem:"",errorState:"NAU"});return}if(f.Protocol!=o){r({stem:"",errorState:"NAP"});return}let e=n.tryParseUrl(f.Url,!0),s=e?e.path:null;if(!s){r({stem:"",errorState:"NAS"});return}r({stem:s})};super.fetchUrl(e,i,"",s,null,()=>!0)}else r({stem:"",errorState:i})},undefined,n.Host.isAuthInvestigation()?["SubstrateDataProvider::getStem"]:undefined)}),()=>"autoDiscovery")}getAllAccountTokens(t,r){let u=n.Host.isAuthInvestigation()?["SubstrateDataProvider::getAllAccountTokens"]:undefined;if(t||n.RuntimeConfig.QfMode!=5)this._accessTokenManager.getAccount(this._authType,n.getSubstrateResourceOrScope(this._authType),!1,!0,n=>{n&&n.Token?r([n]):r(null,i)},undefined,u);else{let t=SearchAppWrapper.CortanaApp.fileExplorerSuggestionPage.currentSyncRootAccount;t?this._accessTokenManager.getAccountByUserName(!0,1,t,!1,!0,n=>{n&&n.Token?r([n]):r(null,i)},u):n.isFileExplorerCurrentPathThisPcOrQuickAccess?this._accessTokenManager.getAllSyncingAccounts(!0,1,!1,!0,n=>{n.length>0?r(n):r(null,i)},u):(SharedLogHelper.LogError("fetchUrl",null,new Error("Substrate provider called without currentSyncRootAccount")),r(null,b))}}fetchUrl(t,i,r,u,f,e){if(!this._autoDiscoveryData.stem){u(this._dataSource,null,this._autoDiscoveryData.errorState,null,!0);return}let h=t==this.getSubstrateInitUrl();t=n.formatString(t,[this._autoDiscoveryData.stem]);i||(i={});let o={numOfPendingResponses:0};n.config.enableFetchStartLogging&&n.InstrumentationHelper.instrumentFetchProviderBegin(n.SequenceNumberManager.getSequenceNumber(),"SSDPU:"+this._dataSource);let s=s=>{let h=Object.assign({},i);h[ut]="Bearer "+s.Token;this._authType==1&&(n.SubstrateTenantName!==s.TenantName&&s.TenantName&&(n.SubstrateTenantName=s.TenantName),(n.TestHookUrlParameters===null||n.TestHookUrlParameters===void 0?void 0:n.TestHookUrlParameters.tenantName)&&(n.SubstrateTenantName=n.TestHookUrlParameters.tenantName));h[ft]=s.RoutingHint;super.fetchUrl(t,h,r,(n,t,i,r,f)=>{--o.numOfPendingResponses,u(n,t,i,r,f,o.numOfPendingResponses!=0)},f,e)};this.getAllAccountTokens(h,(n,t)=>{t?u(this._dataSource,null,t,null,null,!1):n?(o.numOfPendingResponses=n.length,n.forEach(n=>s(n))):(o.numOfPendingResponses=1,s(null))})}fetch(i,r,o,s,h,c){const nt=n.isDataSourceEnabled(this._dataSource,i);let d=!1;if(nt){if(n.config.enableFetchStartLogging&&n.InstrumentationHelper.instrumentFetchProviderBegin(o,"SSDP:"+this._dataSource),i.isSearchHomeZI&&e(this._dataSource)&&n.isMsbQwsDocsCacheEnabled(i)&&!(n.TestHookUrlParameters===null||n.TestHookUrlParameters===void 0?void 0:n.TestHookUrlParameters.msbSHNoRecDocs)){const t=this.getQwsDocsCachedResults();if(t.results){const i=!n.config.msbQwsDocsNoRefreshAfterCachedResults;r(this._dataSource,t.results,null,undefined,undefined,i);d=!0}else if(t.cacheState==n.MsbQfCacheState.Initialized)_w.bfbWsbTel&&bfbWsbTel.logValue("Wsb quick work search document empty",t.cacheState);else{const i=t.lastUpdatedTime==undefined?undefined:{cacheAge:n.getCurrentTime()-t.lastUpdatedTime};_w.bfbWsbTel&&bfbWsbTel.logError("Wsb quick work search document cache error",t.cacheState,undefined,i)}}let y={};y[et]=n.uiLanguageCache;y[ot]=n.getDateWithTimezone();y[v]=navigator.userAgent;typeof _CachedFlights!="undefined"&&_CachedFlights.sort&&(y[st]=_CachedFlights.sort().join(","));y[a]=n.InstrumentationHelper.getImpressionGuid(o);y[u]=f;let g=this.buildParams(c,i.scope,!i.queryToFetch);if(this._providerType!=0||g[l]){let b=this.getClientFlights();t&&(b=b?b+","+t:t);b&&(y[ht]=b);let w=null;i.isSearchHomeZI&&(w=n.safeSetTimeout(()=>{sb_ct(w),w=null,n.config.msbQwsDocsNoRefreshAfterCachedResults&&d||r(this._dataSource,null,k)},pt,"SubstrateDataProvider Fetch"));var tt=(t,u,f,o,s,h)=>{let c=parseInt(f);(c==403||c==401)&&n.safeSetTimeout(()=>this._accessTokenManager.getAccount(this._authType,n.getSubstrateResourceOrScope(this._authType),!0,!0,()=>{},undefined,n.Host.isAuthInvestigation()?["SubstrateDataProvider::onResponseReceived"]:undefined),0,"SubstrateDataProvider onResponseReceived");let l=h;if(i.isSearchHomeZI){if(n.isMsbQwsDocsCacheEnabled(i)&&!n.config.msbQwsDocsNoRefreshAfterCachedResults&&(l=!1),(n.TestHookUrlParameters===null||n.TestHookUrlParameters===void 0?void 0:n.TestHookUrlParameters.msbSHNoRecDocs)&&(u=null),e(t)){const r=p(u,t);if(r&&n.isMsbQwsDocsCacheEnabled(i)){const i={dataSource:t,results:u,lastUpdatedTime:n.getCurrentTime(),cacheState:n.MsbQfCacheState.ValidResults};n.LightweightStorage.setItem(n.ZqSuggestionsStorageKey,JSON.stringify(i))}}if(w==null)return;if(sb_ct(w),w=null,n.config.msbQwsDocsNoRefreshAfterCachedResults&&d)return}r(t,u,f,o,s,l)};super.fetch(i,tt,o,s,h,g,y)}}}getSubstrateBaseUrl(){return _w.BingAtWork&&_w.BingAtWork.wsb&&_w.BingAtWork.wsb.gccRegion===2?bt:wt}getSubstrateEventsUrl(){return this.getSubstrateBaseUrl()+"events"}getSubstrateInitUrl(){return this.getSubstrateBaseUrl()+"init"}getSubstrateSuggestionsUrl(){return this.getSubstrateBaseUrl()+"suggestions?query="}getSubstrateSearchUrl(){return this.getSubstrateBaseUrl()+"query"}getSubstrateRecomendationsUrl(){return this.getSubstrateBaseUrl()+"recommendations"}getQwsDocsCachedResults(){let t={results:undefined,cacheState:n.MsbQfCacheState.Initialized,dataSource:undefined,lastUpdatedTime:undefined};const i=n.LightweightStorage.getItem(n.ZqSuggestionsStorageKey);if(!i)return t;try{t=JSON.parse(i)}catch(r){const u=`[MSB.Error]  QWS docs cache is broken.
                            cacheString=${i},
                            error.message=${r===null||r===void 0?void 0:r.message}`;return t.cacheState=n.MsbQfCacheState.EmptyFromParseError,t.lastUpdatedTime=n.getCurrentTime(),n.LightweightStorage.setItem(n.ZqSuggestionsStorageKey,JSON.stringify(t)),t}return t.cacheState==n.MsbQfCacheState.EmptyFromParseError||t.cacheState==n.MsbQfCacheState.EmptyFromExpired?t:(t&&t.dataSource==this._dataSource&&(n.getCurrentTime()-t.lastUpdatedTime<vt&&!(n.TestHookUrlParameters===null||n.TestHookUrlParameters===void 0?void 0:n.TestHookUrlParameters.msbSHCacheExpired)?p(t.results,this._dataSource)?(t.results=t.results,t.cacheState=n.MsbQfCacheState.ValidResults):t.cacheState=n.MsbQfCacheState.NoResults:(t.cacheState=n.MsbQfCacheState.EmptyFromExpired,t.results=undefined,t.lastUpdatedTime=n.getCurrentTime(),n.LightweightStorage.setItem(n.ZqSuggestionsStorageKey,JSON.stringify(t)))),t)}buildParams(t,i,r){var f,u={};if(this._providerType==0&&(u[n.Service.QueryParams.ConversationId]=t[n.Service.QueryParams.ConversationId],u[g]=tt,this._authType!=1||r||i!=n.Scope.People?i!=n.Scope.All&&(u[h]=it):u[h]=rt,r&&this._authType==1&&t[n.Service.QueryParams.ImpressionGuid]&&(u[n.Service.QueryParams.LogicalId]=t[n.Service.QueryParams.ImpressionGuid]),u[l]=this.getEntityTypes(i,r),i==n.Scope.Documents&&r&&n.config.msbEnableDocumentZQ&&(u[c]=n.config.msbDocumentZQResultsCount==20?lt:ct)),n.TestHookUrlParameters){let t=(f=n.TestHookUrlParameters["3sflights"])!==null&&f!==void 0?f:"";t&&(u[c]=t);n.TestHookUrlParameters["3sdebug"]&&(u[nt]="1")}return u}getEntityTypes(t,i){let r;switch(t){case n.Scope.Documents:r="Documents";break;case n.Scope.People:r="People";break;case n.Scope.All:case n.Scope.Work:let u=[];if(this._authType==1&&u.push("Documents"),!i&&n.RuntimeConfig.QfMode!=5){let t=n.msbHost===null||n.msbHost===void 0?void 0:n.msbHost.tenantManager.isTenantMsbEnabled();t||u.push("People")}r=u.join(",");break;default:throw new Error("Unsupported scope "+t);}return r}instrumentClick(t,i){if(t&&i){let e=[{Key:t,Value:[{Name:"entityclicked",Attributes:[{Key:"Id",Value:i},{Key:"LocalTime",Value:n.getDateWithTimezone()}]}]}],r={};r[u]=f;this.fetchUrl(this.getSubstrateEventsUrl(),r,JSON.stringify(e),()=>{},null,()=>!0)}}}n.SubstrateDataProvider=w})(WSB||(WSB={})),function(n){function y(t,i,r){let u=n.OfficeTypeExtensionConfigs[t];u?n.LocalDataProvider.getApps(u.appIds,t=>{let f=!n.Map.isEmpty(t);f?i(u.uri):r()}):r()}function s(t,i,r){let u=t?new URL(t):null;!u||u.pathname&&u.pathname.indexOf(":")!=-1?n.Host.launchUri(i):y(r,i=>n.Host.launchUri(i+t),()=>n.Host.launchUri(i))}function p(t,i,r){n.setExtraVerbs(t,()=>{let u=[];return u.push({verb:n.JumplistActionItemType[n.JumplistActionItemType.S_OpenInBrowser],displayName:n.Host.getLocString("OpenInBrowser"),executeSync:()=>n.Host.launchUri(i),icon:{type:1,content:"&#xE774"}}),t.locationUrl&&u.push({verb:n.JumplistActionItemType[n.JumplistActionItemType.S_OpenFileLocationInBrowser],displayName:n.Host.getLocString("OpenFileLocationIn",r),executeSync:()=>n.Host.launchUri(t.locationUrl),icon:{type:2,content:"&#xE838"}}),t.url&&SearchAppWrapper.CortanaApp.copyToClipboard&&u.push({verb:n.JumplistActionItemType[n.JumplistActionItemType.S_CopyFullPath],displayName:n.Host.getLocString("CopyFullPath"),executeSync:()=>SearchAppWrapper.CortanaApp.copyToClipboard(t.url,""),icon:{type:1,content:"&#xE8C8"}}),u},!1)}function h(t,i,r,u,e,o,h,c,l,a,v,y,w,b,k,d,g,nt,tt,it,rt){let ot=n.ScopeConfig[n.Scope.Documents].icon;u||(u=r+"?web=1");o=HitHighlightingParser.removeMarkers(o);h&&(h=h.toLocaleLowerCase());let et="FL",ut=n.createSuggestion(i,e,h&&n.getIconForTypeAsync(ot,"."+h),ot,et,o,n.InstrumentedItem.createInstrumentedItem(d,et),8,d,!0);ut.instrumentPingBack=k;let ht=n.isZeroInputAllScope(i);ut.click=()=>{ht&&_w.bfbWsbTel&&(bfbWsbTel.logSearchHomeClick("Documents"),n.msbHost===null||n.msbHost===void 0?void 0:n.msbHost.substrateLogger.logSearchEntityActions("Wsb.SearchHome")),s(r,u,h)};ut.extensionLC="."+h;ut.lastModifiedDate=n.toDate(l);ut.lastModifiedBy=a;ut.lastAccessDate=n.toDate(v);ut.author=y;ut.matchedOnlyOnAuthor=w;ut.matchedOnlyOnContent=b;ut.textContentIfMatched=tt;ut.siteTitle=rt;ut.url=r;let st=c=="OneDriveBusiness"?3:c=="SharePoint"?4:undefined,ct=n.nicerCloudFilesEnabled(i,ut);n.setDocumentLocationProperties(ut,o,c,ct);w?ut.match=n.createMatch(n.MatchType.Author,y):e.includes(HitHighlightingParser.startMarker)||(ut.match=n.tryGetLocationMatch(ut.path,g)||it);i.isSearchHomeZI||(ut.sourceForGroup=st);const ft=new Date(n.getCurrentDate().toUTCString());if(t){ut.meeting=t;ut.features.push("MeetingRecommendation");const i=new Date(t.Start),r=Math.floor((i.getTime()-ft.getTime())/n.MinuteToMs);ut.explanation=r>0?n.Host.getLocString("DocumentRelatedToMeeting",HitHighlightingParser.addMarkers(t.Subject.trim()),f(ft,new Date(t.Start))):n.Host.getLocString("DocumentRelatedToMeetingNow",HitHighlightingParser.addMarkers(t.Subject.trim()))}else if(i.isSearchHomeZI){let t=ut.lastModifiedBy&&ut.lastModifiedDate&&(!ut.lastAccessDate||ut.lastModifiedDate>=ut.lastAccessDate)?f(ut.lastModifiedDate,ft):null;if(t)ut.explanation=n.Host.getLocString("DocumentLastModifiedBy",HitHighlightingParser.addMarkers(ut.lastModifiedBy),t);else if(ut.lastAccessDate){let t=f(ut.lastAccessDate,ft);t&&(ut.explanation=n.Host.getLocString("DocumentLastAccessed",HitHighlightingParser.addMarkers(n.Host.getLocString("YouLabel")),t))}}return n.setFileTemplate(i,g,nt,ut),p(ut,u,n.getGroupSourceDisplayName(st)),ut.reactKey=et+e+y+r,ut.classNames.push("fbig"),ut}function f(t,i){if(!t||!i)return null;const r=i.getTime()-t.getTime();if(r<0)return null;const u=r/n.DayToMs;if(u>=1)return n.Host.getLocString("TimeDayShorthandPattern",Math.floor(u).toString());const f=r/n.HourToMs;if(f>=1)return n.Host.getLocString("TimeHourShorthandPattern",Math.floor(f).toString());const e=r/n.MinuteToMs;return n.Host.getLocString("TimeMinuteShorthandPattern",Math.floor(e).toString())}const r={Word:{appIds:["Microsoft.Office.WINWORD.EXE.15","Microsoft.Office.WINWORD.EXE.16","{6D809377-6AF0-444B-8957-A3773F02200E}\\Microsoft Office\\Office15\\WINWORD.EXE","{7C5A40EF-A0FB-4BFC-874A-C0F2E0B9FA8E}\\Microsoft Office\\Office15\\WINWORD.EXE","{6D809377-6AF0-444B-8957-A3773F02200E}\\Microsoft Office\\Office16\\WINWORD.EXE","{7C5A40EF-A0FB-4BFC-874A-C0F2E0B9FA8E}\\Microsoft Office\\Office16\\WINWORD.EXE","Microsoft.Office.Word_8wekyb3d8bbwe!microsoft.word"],uri:"ms-word:ofe|u|"},Excel:{appIds:["Microsoft.Office.EXCEL.EXE.15","Microsoft.Office.EXCEL.EXE.16","{6D809377-6AF0-444B-8957-A3773F02200E}\\Microsoft Office\\Office15\\EXCEL.EXE","{7C5A40EF-A0FB-4BFC-874A-C0F2E0B9FA8E}\\Microsoft Office\\Office15\\EXCEL.EXE","{6D809377-6AF0-444B-8957-A3773F02200E}\\Microsoft Office\\Office16\\EXCEL.EXE","{7C5A40EF-A0FB-4BFC-874A-C0F2E0B9FA8E}\\Microsoft Office\\Office16\\EXCEL.EXE","Microsoft.Office.Excel_8wekyb3d8bbwe!microsoft.excel"],uri:"ms-excel:ofe|u|"},PowerPoint:{appIds:["Microsoft.Office.POWERPNT.EXE.15","Microsoft.Office.POWERPNT.EXE.16","{6D809377-6AF0-444B-8957-A3773F02200E}\\Microsoft Office\\Office15\\POWERPNT.EXE","{7C5A40EF-A0FB-4BFC-874A-C0F2E0B9FA8E}\\Microsoft Office\\Office15\\POWERPNT.EXE","{6D809377-6AF0-444B-8957-A3773F02200E}\\Microsoft Office\\Office16\\POWERPNT.EXE","{7C5A40EF-A0FB-4BFC-874A-C0F2E0B9FA8E}\\Microsoft Office\\Office16\\POWERPNT.EXE","Microsoft.Office.PowerPoint_8wekyb3d8bbwe!microsoft.pptim"],uri:"ms-powerpoint:ofe|u|"},Visio:{appIds:["{7C5A40EF-A0FB-4BFC-874A-C0F2E0B9FA8E}\\Microsoft Office\\Office15\\VISIO.EXE","{7C5A40EF-A0FB-4BFC-874A-C0F2E0B9FA8E}\\Microsoft Office\\Office14\\VISIO.EXE","{6D809377-6AF0-444B-8957-A3773F02200E}\\Microsoft Office\\Office16\\VISIO.EXE","{7C5A40EF-A0FB-4BFC-874A-C0F2E0B9FA8E}\\Microsoft Office\\Office16\\VISIO.EXE","Microsoft.Office.VISIO.EXE.15"],uri:"ms-visio:ofe|u|"},OneNote:{appIds:["Microsoft.Office.ONENOTE.EXE.15","Microsoft.Office.ONENOTE.EXE.16","{6D809377-6AF0-444B-8957-A3773F02200E}\\Microsoft Office\\Office15\\ONENOTE.EXE","{7C5A40EF-A0FB-4BFC-874A-C0F2E0B9FA8E}\\Microsoft Office\\Office15\\ONENOTE.EXE","{6D809377-6AF0-444B-8957-A3773F02200E}\\Microsoft Office\\Office16\\ONENOTE.EXE","{7C5A40EF-A0FB-4BFC-874A-C0F2E0B9FA8E}\\Microsoft Office\\Office16\\ONENOTE.EXE","Microsoft.Office.OneNote_8wekyb3d8bbwe!microsoft.onenoteim"],uri:"onenote:"}},e="sip:",c=["Microsoft.Office.lync.exe.15","{6D809377-6AF0-444B-8957-A3773F02200E}Microsoft OfficeOffice15lync.exe","{6D809377-6AF0-444B-8957-A3773F02200E}Microsoft OfficeOffice16lync.exe","{7C5A40EF-A0FB-4BFC-874A-C0F2E0B9FA8E}Microsoft OfficeOffice15lync.exe","{7C5A40EF-A0FB-4BFC-874A-C0F2E0B9FA8E}Microsoft OfficeOffice16lync.exe","{6D809377-6AF0-444B-8957-A3773F02200E}MSOfficeOffice15lync.exe","{6D809377-6AF0-444B-8957-A3773F02200E}MSOfficeOffice16lync.exe","{7C5A40EF-A0FB-4BFC-874A-C0F2E0B9FA8E}MSOfficeOffice15lync.exe","{7C5A40EF-A0FB-4BFC-874A-C0F2E0B9FA8E}MSOfficeOffice16lync.exe","Microsoft.Office.Desktop_8wekyb3d8bbwe!Lync","com.squirrel.Teams.Teams",],t=r.Word,i=r.Excel,u=r.PowerPoint,o=r.Visio,l="https://gcchigh.loki.office365.us/api/v1/configuration/cortana",a="https://loki.delve.office.com/api/v1/configuration/cortana";n.OfficeTypeExtensionConfigs={doc:t,dot:t,dotx:t,docx:t,docm:t,docb:t,xls:i,xlm:i,xlsx:i,xlsm:i,xlsb:i,xltx:i,ppt:u,pps:u,pptx:u,pptm:u,vsd:o,vsdx:o,one:r.OneNote};class v{constructor(n,t,i,r){this._substrateSuggestionsDataProvider=n;this._accessTokenManager=t;this._substrateProfilePictureProvider=i;this._authType=r;this._mailboxLocations={}}parse(t,i,r,u,f,e){if(n.isDataSourceEnabled(r,t)){let o=[];if(!u||!u.Groups){e(r,o,null);return}let s=r=="SSUE"?n.config.aadPeopleCardHandoffEnabled&&!(n.msbHost===null||n.msbHost===void 0?void 0:n.msbHost.tenantManager.isTenantMsbEnabled()):n.config.msaPeopleCardHandoffEnabled,v=n.getEffectiveQuery(t),l=n.isL2(t),a=c=>{for(let e of u.Groups)if(e.Suggestions&&e.Suggestions.length)switch(e.Type){case"Documents":let a=e.Suggestions;for(let r of a){let f=n.safeExecute(()=>h(undefined,t,r.AccessUrl||r.Url,null,r.Text,r.FileName,r.FileExtension,r.FileSourceType=="OneDriveForBusiness"?"OneDriveBusiness":"SharePoint",r.DateModified?r.DateModified+"Z":null,r.ModifiedByDisplayName,r.DateAccessed?r.DateAccessed+"Z":null,r.CreatedBy||HitHighlightingParser.removeMarkers(r.Author),r.PropertyHits&&r.PropertyHits[0]=="Author",!1,()=>this._substrateSuggestionsDataProvider.instrumentClick(u.Instrumentation.TraceId,r.ReferenceId),i,v,l,"",null,r.SourceTitle),"buildSubstrateDocumentSuggestion");if(f&&n.isValidSuggestion(f,"SubstrateDocumentsSuggestionsParser")&&(o.push(f),t.isSearchHomeZI&&n.msbHost&&n.msbHost.enableQws()&&n.isMsbEnterprise()&&!n.msbHost.tenantManager.isGccHighTenant()&&o.length>=(n.config.msbEnableDocumentZQ&&t.scope==n.Scope.Documents?n.config.msbDocumentZQResultsCount:n.config.ziRecommendedDocsResultsParseCount)))break}t.isSearchHomeZI||n.decorateSuggestionsWithParentFolder(o);break;case"People":let y=e.Suggestions;for(let f of y){let e=n.safeExecute(()=>this.buildPersonSuggestion(s,f,i,u.Instrumentation.TraceId,l,r,t,c),"buildPersonSuggestion");e&&n.isValidSuggestion(e,"SubstratePeopleSuggestionsParser")&&o.push(e)}s&&n.safeExecute(()=>this.prefetchPeopleCards(o.filter(n=>n.type=="PPL"),i,f),"prefetchPeopleCards");n.isL2(t)||this.decorateContactsWithSameDisplayName(o,t);break;default:SharedLogHelper.LogError("parseSubstrateResponse",e.Type,new Error("Unexpected group type"))}t.isSearchHomeZI&&t.scope===n.Scope.All&&(n.msbHost===null||n.msbHost===void 0?void 0:n.msbHost.enableQws())&&(o===null||o===void 0?void 0:o.length)>0&&_w.bfbWsbTel&&bfbWsbTel.logSearchHomeImpression("Documents");e(r,o,null)};r=="SSUE"?n.LocalDataProvider.getApps(c,t=>a(!n.Map.isEmpty(t))):a(!1)}}prefetchPeopleCards(t,i,r){t.length&&this.getPeopleCardTokenAndMailboxLocation(u=>{if(u&&u.token&&u.location&&i==n.SequenceNumberManager.getSequenceNumber()&&r()){let o=u.location+"api/v1/personacards/preparePersona",f=SearchAppWrapper.CortanaApp.createStringMap();f.Authorization="Bearer "+u.token;f["X-ClientCorrelationId"]=n.InstrumentationHelper.getImpressionGuid(i);f["X-ClientType"]="6";let e=SearchAppWrapper.CortanaApp.createStringMap();e["Content-Type"]="application/json";let s=JSON.stringify(t.map(n=>({Smtp:n.email,PersonaType:"User"})));n.Async.safeChain("prefetchPeopleCards",()=>SearchAppWrapper.CortanaApp.makeHttpRequestAsync(1,o,f,s,e),n=>{if(n.statusCode!=200&&n.statusCode!=204){let t=new Error("Prefetch request failed with status code: "+n.statusCode);SharedLogHelper.LogError("prefetchPeopleCards",null,t)}})}})}buildPersonSuggestion(t,i,r,u,f,o,s,h){if(!i.EmailAddresses||!i.EmailAddresses[0])return null;const it=i.PeopleType=="Group";let d=i.EmailAddresses[0],l=HitHighlightingParser.removeMarkers(d),y,g;it?y={content:"&#xE716",type:2}:(y=this._substrateProfilePictureProvider.getPersonDefaultIcon(i.DisplayName),g=this._substrateProfilePictureProvider.getProfilePictureIcon(this._authType,l,y));let nt=o=="SSUE",p="PPL",c=n.createSuggestion(s,i.Text,g,y,p,i.DisplayName,n.InstrumentedItem.createInstrumentedItem(r,p),nt?8:12,r,!0),w=i.Id,b;if(nt){let n=i.Id.split("@");w=n[0];b=n[1]}c.email=l;c.emailHH=d;c.uniqueName=l;let a=i.ImAddress;if(a&&!a.startsWith(e)&&(a=a.includes(":")?undefined:e+a),a){c.imAddress=a;let n=a.substr(e.length);n!=l&&(c.alternativeEmail=n)}let k=w&&b&&!t;c.tooltip=this.getPersonTooltip(i.DisplayName,i.Department,i.JobTitle,i.OfficeLocation,i.CompanyName,l,c.alternativeEmail);c.instrumentPingBack=()=>this._substrateSuggestionsDataProvider.instrumentClick(u,i.ReferenceId);c.click=n=>this.onPersonSuggestionClick(t,k,l,c.query,r,n,w,b);let tt=n.Host.getLocString("Email"),rt=()=>n.Host.launchUri("mailto:"+l),v={};if(v[tt]=[{text:l,click:rt}],c.alternativeEmail){let t=()=>n.Host.launchUri("mailto:"+c.alternativeEmail);v[tt].push({text:c.alternativeEmail,click:t})}return i.OfficeLocation&&(v[n.Host.getLocString("Location")]=[{text:i.OfficeLocation}]),i.CompanyName&&(v[n.Host.getLocString("Company")]=[{text:i.CompanyName}]),c.previewMetadata=v,c.department=i.Department,this.setPersonTemplate(c,f,i.JobTitle,s),this.setPersonContextMenuItems(c,t||k,h),!n.RuntimeConfig.AlwaysWide&&(t||k)&&(c.calculateChildSuggestions=()=>this.getPersonChildSuggestions(s,c,r,o,h)),c.reactKey=p+i.PeopleType+i.DisplayName+i.Id,c}getPersonChildSuggestions(t,i,r,u,f){let e=[];e.push(this.getChildSuggestion(t,i,"CortanaAnnotation_Email","&#xE715","mailto:"+i.email,"PPLE",r));i.imAddress&&f&&e.push(this.getChildSuggestion(t,i,"SendInstantMessage","&#xE8BD",i.imAddress,"PPLM",r));i.childSuggestions=e;i.calculateChildSuggestions=null;n.InstrumentationHelper.instrumentDataSource(r,u,i.childSuggestions,null)}getChildSuggestion(t,i,r,u,f,e,o){let h=n.Host.getLocString(r),s=n.createSuggestion(t,h,null,{type:2,content:u},e,h,n.InstrumentedItem.createInstrumentedItem(o,e),i.handoffType,o,!1,null,null,!0);return s.parent=i,s.groupType=n.GroupType.Contact,s.click=()=>n.Host.launchUri(f),s.instrumentPingBack=i.instrumentPingBack,s.reactKey=e+h+f,s}getPeopleCardTokenAndMailboxLocation(t){this._accessTokenManager.getAccount(this._authType,this._authType==1?"394866fc-eedb-4f01-8536-3ff84b16be2a":"LiveProfileCard.Access",!1,!0,i=>{if(!i||!i.Token){t(null);return}let r=i.Token,f=this._mailboxLocations[i.RoutingHint];if(f){t({token:r,location:f});return}let o=SearchAppWrapper.CortanaApp.createStringMap(),u=SearchAppWrapper.CortanaApp.createStringMap();u.Authorization="Bearer "+r;u["X-ClientType"]="6";let e=a;_w.BingAtWork&&_w.BingAtWork.wsb&&_w.BingAtWork.wsb.gccRegion===2&&(e=l);n.Async.safeChain("lokiConfiguration",()=>SearchAppWrapper.CortanaApp.makeHttpRequestAsync(0,e,u,"",o),u=>{if(u.statusCode!==200){t(null);return}n.Async.safeChain("lokiConfigurationResponse",()=>u.readAsStringAsync(),u=>{if(!u){t(null);return}let f=n.safeExecute(()=>JSON.parse(u),"parseLokiConfiguration");if(!f||!f.LokiUrl){t(null);return}this._mailboxLocations[i.RoutingHint]=f.LokiUrl;t({token:r,location:f.LokiUrl})},()=>t(null))},()=>t(null))},undefined,n.Host.isAuthInvestigation()?["SubstrateSuggParser::getPeopleCardTokenAndMailboxLocation"]:undefined)}getSharePointHost(n){let t=new DOMParser;for(let i of n.value)if(i.serviceElements)for(let n of i.serviceElements){let f=t.parseFromString(n,"text/xml"),i=f.getElementsByTagName("ServiceParameter"),r,u=!1;for(let n=0;n<i.length;n++){let t=i[n].getElementsByTagName("Name");if(t[0].childNodes[0].nodeValue=="IsDefaultDataLocation"){let t=i[n].getElementsByTagName("Value");t[0].childNodes[0].nodeValue=="True"&&(u=!0)}else if(t[0].childNodes[0].nodeValue=="SPO_MySiteHost_AboutMeUrl"){let t=i[n].getElementsByTagName("Value");r=t[0].childNodes[0].nodeValue}if(u&&r)return r}}return null}onPersonSuggestionClick(t,i,r,u,f,e,o,s){let h=()=>n.Host.launchUri("mailto:"+r),c=()=>{let t=()=>n.Host.launchUri(this._sharePointSiteHostUrl+"?aadObjectId="+o);this._sharePointSiteHostUrl?t():this._accessTokenManager.getAccount(1,"https://graph.windows.net/",!1,!0,i=>{if(!i||!i.Token){h();return}let u=SearchAppWrapper.CortanaApp.createStringMap(),r=SearchAppWrapper.CortanaApp.createStringMap();r.Authorization="Bearer "+i.Token;n.Async.safeChain("getSharePointUrl",()=>SearchAppWrapper.CortanaApp.makeHttpRequestAsync(0,"https://graph.windows.net/"+s+"/tenantDetails/"+s+"/serviceInfo?api-version=1.6-internal",r,"",u),i=>{if(i.statusCode!==200){h();return}n.Async.safeChain("readSharePointUrlResponse",()=>i.readAsStringAsync(),i=>{let r=i?n.safeExecute(()=>JSON.parse(i),"parseSharePointUrlResponse"):null;if(!r){h();return}this._sharePointSiteHostUrl=this.getSharePointHost(r);this._sharePointSiteHostUrl?t():h()},h)},h)},undefined,n.Host.isAuthInvestigation()?["SubstrateSuggParser::onPersonSuggestionClick"]:undefined)};t?this.getPeopleCardTokenAndMailboxLocation(t=>{if(f==n.SequenceNumberManager.getSequenceNumber())if(t&&t.token&&t.location){let i=t.location+"api/v1/personacard?clientType=Cortana&userSmtp="+r+"&ClientCorrelationId="+n.InstrumentationHelper.getImpressionGuid(f)+"&cts="+e+"&CultureInfoName="+n.uiLanguageCache;n.Host.launchWebContent(i,u,t.token)}else i?c():h()}):i?c():h()}setPersonContextMenuItems(t,i,r){n.setExtraVerbs(t,()=>{let u=[],f=t.childSuggestions&&t.childSuggestions.some(n=>n.displayed);return f||(u.push({verb:n.JumplistActionItemType[n.JumplistActionItemType.S_SendEmail],displayName:n.Host.getLocString("CortanaAnnotation_Email"),executeSync:()=>n.Host.launchUri("mailto:"+t.email),isDefault:!i,icon:{content:"&#xE715",type:2}}),t.imAddress&&r&&u.push({verb:n.JumplistActionItemType[n.JumplistActionItemType.S_SendInstantMessage],displayName:n.Host.getLocString("SendInstantMessage"),executeSync:()=>n.Host.launchUri(t.imAddress),icon:{content:"&#xE8BD",type:2}})),SearchAppWrapper.CortanaApp.copyToClipboard&&u.push({verb:n.JumplistActionItemType[n.JumplistActionItemType.S_CopyPersonDetails],displayName:n.Host.getLocString("CopyDetails"),executeSync:()=>SearchAppWrapper.CortanaApp.copyToClipboard(t.tooltip.replace(/\n/g,"\r\n"),""),icon:{type:1,content:"&#xE8C8"}}),u},!0)}setPersonTemplate(t,i,r,u){let f=n.getEffectiveQuery(u);if(r?(t.jobTitle=r,t.primaryMetadata=r):t.text!=t.emailHH&&(t.primaryMetadata=t.emailHH),f&&!t.text.includes(HitHighlightingParser.startMarker))if(t.emailHH.includes(HitHighlightingParser.startMarker))t.template=1,t.primaryMetadata=t.emailHH;else if(t.alternativeEmail){let n=HitHighlightingParser.addMarkers(t.alternativeEmail,f);n.includes(HitHighlightingParser.startMarker)&&(t.template=1,t.primaryMetadata=n)}t.narratorText=n.getNarratorText(t);i?(t.template=u.isSearchHomeZI?0:1,u.isSearchHomeZI||t.classNames.push("people","topResultTemplateInGroups")):t.template==1&&t.classNames.push("forceNoWrapOutsideTopResult")}getPersonTooltip(n,t,i,r,u,f,e){let o="",s=[n,i,t,r,u];n!=f&&s.push(f);e&&n!=e&&s.push(e);for(let n of s)n&&(o+=o?"\n"+n:n);return o}decorateContactsWithSameDisplayName(t,i){for(let r=0;r<t.length-1;++r){let u=t[r];if(u.type=="PPL")for(let f=r+1;f<t.length;++f){let r=t[f];if(r.type=="PPL"&&u.text.toLocaleLowerCase()==r.text.toLocaleLowerCase()){n.isL2(i)||(u.template!=1&&u.classNames.push("forceNoWrapOutsideTopResult"),r.template!=1&&r.classNames.push("forceNoWrapOutsideTopResult"));u.template=r.template=1;u.primaryMetadata=u.emailHH;r.primaryMetadata=r.emailHH;break}}}}}n.SubstrateSuggestionsParser=v;n.launchDocument=s;n.buildSubstrateDocumentSuggestion=h;n.formatDurationShorthand=f}(WSB||(WSB={})),function(n){function r(n,t){return()=>n(t)}function u(n){return encodeURIComponent(n.replace(/-/g,"/").replace(/_/g,"+"))}let f=["Microsoft.Office.OUTLOOK.EXE.15","Microsoft.Office.OUTLOOK.EXE.16","{6D809377-6AF0-444B-8957-A3773F02200E}Microsoft OfficeOffice15OUTLOOK.EXE","{7C5A40EF-A0FB-4BFC-874A-C0F2E0B9FA8E}Microsoft OfficeOffice15OUTLOOK.EXE"];const t="OutlookLaunchPref",i=[0,1],e="https://outlook.office365.com/mail/deeplink/attachment/{0}/{1}";class o{constructor(n){this._substrateSuggestionsDataProvider=n;this._outlookLaunchPreference={}}parse(t,i,r,u,f,e){var s,h;if(n.isDataSourceEnabled(r,t)){let o=[];if(!u||!u.EntitySets){e(r,o,null);return}let c=n.getEffectiveQuery(t),l=n.getEffectiveScope(t),a=!1;for(let f of u.EntitySets)if(f.ResultSets)for(let e of f.ResultSets)if(e.Results)switch(l){case n.Scope.Emails:for(let f of e.Results){let e=n.safeExecute(()=>this.buildMessageSuggestion(t,f.Source,i,r,u.Instrumentation?u.Instrumentation.TraceId:null,f.ReferenceId,c),"buildMessageSuggestion");e&&n.isValidSuggestion(e,"parseSubstrateSearchResponse_emails",!1)&&o.push(e)}break;case n.Scope.Documents:case n.Scope.All:let f=e.Results,v=r=="SREE"?(h=(s=e.RecommendationsContext)===null||s===void 0?void 0:s.MeetingContext)===null||h===void 0?void 0:h.Source:null;v&&(f=f.filter((n,t)=>{if(n.Provenance!="Exchange")return!0;let i=n.Source.FileName;return!f.some((n,r)=>{var u;if(t==r||n.Provenance=="Exchange")return!1;let f=n.Source;return((u=f.LastShared)===null||u===void 0?void 0:u.SharingType)=="Attachment"&&f.FileName==i})}));for(let r of f)if(!t.isSearchHomeZI||!n.config.use3sRecRecommendedFiles||r.Provenance!="Exchange"){let f=n.safeExecute(()=>this.buildDocumentSuggestion(v,r.Source,i,u.Instrumentation?u.Instrumentation.TraceId:null,r.ReferenceId,r.Provenance||e.Provenance,c,t),"buildDocumentSuggestion");if(f&&n.isValidSuggestion(f,"parseSubstrateSearchResponse_documents")&&(o.push(f),t.isSearchHomeZI&&n.config.use3sRecRecommendedFiles&&n.msbHost&&n.msbHost.enableQws()&&n.isMsbEnterprise()&&!n.msbHost.tenantManager.isGccHighTenant()&&o.length>=n.config.ziRecommendedDocsResultsCount))break}a=!v;break;default:SharedLogHelper.LogError("parseSubstrateSearchResponse",l.toString(),new Error("Unexpected scope"))}a&&n.decorateSuggestionsWithParentFolder(o);e(r,o,null)}}buildDocumentSuggestion(t,i,r,f,o,s,h,c){var v,y;let p=h?HitHighlightingParser.addMarkers(i.FileName,h):i.FileName,l=n.config.disableSyntaxHighlight?p.toLocaleLowerCase().includes(h.toLocaleLowerCase()):p.includes(HitHighlightingParser.startMarker);if(h&&!l&&(!n.config.minLengthForContentMatch||c.queryToFetch.length<n.config.minLengthForContentMatch))return null;let g=i.Author==null?null:i.Author.DisplayName,w=n.matchesOnPropertyHH(g,h),tt=i.Description?n.decodeHtml(i.Description).replace(/<\/?[^>]+(>|$)/g,""):"",[it,nt]=n.tryGetTextContentMatch(tt,h),b=i.LastModifiedBy==null?null:i.LastModifiedBy.DisplayName,a;l||w||(n.matchesOnPropertyHH(b,h)&&(a=n.createMatch(n.MatchType.LastModifiedBy,b)),a=a||nt);let k=i.Url,d=i.WebUrl;return s=="Exchange"&&(d=k,k=null,((v=i.LastShared)===null||v===void 0?void 0:v.AttachmentId)&&(t===null||t===void 0?void 0:t.Id)&&(d=n.formatString(e,[u(t.Id),u(i.LastShared.AttachmentId)]))),n.buildSubstrateDocumentSuggestion(t,c,k,d,p,i.FileName,i.FileExtension,s,i.LastModifiedDateTime,b,(y=i.UserRelationship)===null||y===void 0?void 0:y.LastAccessDateTime,g,!l&&w,!l&&!w&&!!nt,()=>this._substrateSuggestionsDataProvider.instrumentClick(f,o),r,h,n.isL2(c),it,a,i.SiteTitle)}buildMessageSuggestion(t,i,r,u,f,e,o){if(i.IsDraft)return null;if(!i.WebLink)return SharedLogHelper.LogError("buildMessageSuggestion",null,new Error("Missing web link")),null;let a=i.From&&i.From.EmailAddress?i.From.EmailAddress.Name||i.From.EmailAddress.Address:null,v=i.Sender&&i.Sender.EmailAddress?i.Sender.EmailAddress.Name||i.Sender.EmailAddress.Address:null;if(!a&&!v)return SharedLogHelper.LogError("buildMessageSuggestion",null,new Error("No valid from or sender fields present")),null;let c=a||v,h=i.Subject,y=u=="SSEE",l="OLE",s=n.createSuggestion(t,HitHighlightingParser.addMarkers(c,o),null,null,l,h||c,n.InstrumentedItem.createInstrumentedItem(r,l),y?8:12,r,!0),p=y?1:2;if(this.setEmailContextMenuItems(s,i.ItemHexId,i.WebLink,p),s.click=()=>this.launchEmail(i.ItemHexId,i.WebLink,p),s.template=1,s.classNames.push("email","forceNoWrapOutsideTopResult","topResultTemplateInGroups"),s.primaryMetadata=HitHighlightingParser.addMarkers(h,o),s.secondaryMetadata=HitHighlightingParser.addMarkers(i.Preview,o),s.tooltip=c+(h?"\n"+h:""),s.hc=i.SortOrderSource=="Relevance",s.previewIcon={content:"&#xE715",type:2,needsAccentColor:!0},i.HasAttachments&&(s.secondaryIcon={content:"&#xE723",type:2}),i.IsRead||s.classNames.push("accentColor"),i.DateTimeReceived){let t=n.toDate(i.DateTimeReceived),r=n.getTodayTimeString(t);s.dateShort=r?r:t.toLocaleDateString();s.dateLong=t.toLocaleString(navigator.language,{year:"numeric",month:"numeric",day:"numeric"});s.dateAndTime=t.toLocaleString(navigator.language,{weekday:"long",month:"long",day:"numeric",year:"numeric",hour:"numeric",minute:"numeric"})}return s.internetMessageId=i.InternetMessageId,s.instrumentPingBack=()=>this._substrateSuggestionsDataProvider.instrumentClick(f,e),s.narratorText=n.getNarratorText(s),s.subject=HitHighlightingParser.addMarkers(h,o),s.from=c,s.to=i.DisplayTo,s.preview=i.Preview,s.hasAttachment=i.HasAttachments,s.importance=i.Importance!="Normal"?n.Host.getLocString("EmailImportance",i.Importance):"",s.reactKey=l+i.WebLink,s}setEmailContextMenuItems(t,i,r,u){i&&n.setExtraVerbsAsync(t,()=>{let t=[];return ThresholdUtilities.createPromise(e=>{n.LocalDataProvider.getApps(f,f=>{let o=!n.Map.isEmpty(f);if(o){let o=this.getOutlookLaunchPreference(u),s="Outlook",h,e=Object.keys(f);e.length==1&&(s=f[e[0]].deviceItem.displayName,h=f[e[0]].getIcon);t.push({verb:"OpenInOutlookWeb",displayName:n.Host.getLocString("OpenIn","Outlook Web"),executeSync:()=>this.launchOutlookWeb(r,u),isDefault:o==0,icon:{content:"&#xE774",type:1}});t.push({verb:"LaunchOutlookNative",displayName:n.Host.getLocString("OpenIn",s),executeSync:()=>this.launchOutlokNative(i,u),isDefault:o==1,getIcon:h})}e(t)})})},!0)}launchOutlookWeb(t,i,r){n.Host.launchUri(t,!1,()=>this.setOutlookLaunchPreference(0,i),r)}launchOutlokNative(t,i,r){n.Host.launchOutlook(t,()=>this.setOutlookLaunchPreference(1,i),r)}launchEmail(t,u,f){let s=this.getOutlookLaunchPreference(f),o=[s];for(let t of i)n.contains(o,t)||o.push(t);let e;for(let n=o.length-1;n>=0;n--)switch(o[n]){case 1:e=r(n=>this.launchOutlokNative(t,f,n),e);break;case 0:e=r(n=>this.launchOutlookWeb(u,f,n),e)}e()}getOutlookLaunchPreference(r){if(!this._outlookLaunchPreference[r]){let u=parseInt(n.LightweightStorage.getItem(t+r));this._outlookLaunchPreference[r]=isNaN(u)?i[0]:u}return this._outlookLaunchPreference[r]}setOutlookLaunchPreference(i,r){this._outlookLaunchPreference[r]=i;n.LightweightStorage.setItem(t+r,i.toString())}}n.SubstrateSearchParser=o}(WSB||(WSB={}))