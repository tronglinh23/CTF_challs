var __assign=this&&this.__assign||function(){return __assign=Object.assign||function(n){for(var t,r,i=1,u=arguments.length;i<u;i++){t=arguments[i];for(r in t)Object.prototype.hasOwnProperty.call(t,r)&&(n[r]=t[r])}return n},__assign.apply(this,arguments)},WSB;(function(n){var t,i;(function(t){function o(n,t,i){var r,u;n?n.RewardsUser?(r=n.Balance&&n.Balance.Available,typeof r=="number"?(u=n.UserProfileAttributes&&n.UserProfileAttributes.give_user&&n.UserProfileAttributes.give_user.toLowerCase()=="true",t({IsRewardsUser:!0,Balance:r,IsGiveUser:u})):i(n.ErrorDetail)):n.ErrorDetail&&n.ErrorDetail.ErrorCode===5003?t({IsRewardsUser:!1}):i(n.ErrorDetail):i(null)}function s(t,r,f){var e={};e["X-Search-RPSToken"]=t;n.fetchUrlJson(i,e,u(),function(n){return o(n,r,f)})}function h(t){return new Promise(function(r){var f={};f["X-Search-RPSToken"]=t;n.fetchUrlJson(i,f,u(),r)})}function c(t,i){var u=__assign(__assign({},r),i||{});return new Promise(function(i){n.fetchUrlJson(f,{"X-Search-RPSToken":t},JSON.stringify(u),i)})}function l(t,i){var u=__assign(__assign({},r),i);return new Promise(function(i){n.fetchUrlJson(e,{"X-Search-RPSToken":t},JSON.stringify(u),i)})}function u(n){var t={PartnerId:"WSB",Channel:"WSB"};return n&&(t.UserId=n),JSON.stringify(t)}var i="/msrewards/api/v1/getuserinfo",f="/msrewards/api/v1/user/create",e="/msrewards/api/v1/user/report",r={PartnerId:"WindowsSearchBox",Channel:"WSB"};t.getUserInfoAsync=s;t.getUserInfoAsyncPromise=h;t.createUserAsyncPromise=c;t.reportActivityAsyncPromise=l})(t=n.MsRewardsApi||(n.MsRewardsApi={})),function(t){function u(){}function i(n){return"RewardsPoints_"+n.accountUserName}function r(r){var e=i(r),u=n.LightweightStorage.getItem(e),f=u?+u:0;return f>t.NonMembersMaxPointsAccrued?t.NonMembersMaxPointsAccrued:f}function f(u,f){if(f>t.NonMembersMaxPointsAccrued&&(f=t.NonMembersMaxPointsAccrued),r(u)!=f){var e=i(u);return f?n.LightweightStorage.setItem(e,""+f):n.LightweightStorage.removeItem(e),!0}return!1}t.NonMembersMaxPointsAccrued=200;t.init=u;t.getBalance=r;t.setNewBalance=f}(i=n.MsRewardsNonMemberApi||(n.MsRewardsNonMemberApi={}))})(WSB||(WSB={}))