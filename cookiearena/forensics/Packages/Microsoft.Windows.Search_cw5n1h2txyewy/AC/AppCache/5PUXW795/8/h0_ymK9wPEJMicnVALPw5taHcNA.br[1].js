var WSB;(function(n){let t;(function(t){function o(n,t,i){if(n)if(n.RewardsUser){let r=n.Balance&&n.Balance.Available;if(typeof r=="number"){const i=n.UserProfileAttributes&&n.UserProfileAttributes.give_user&&n.UserProfileAttributes.give_user.toLowerCase()=="true";t({IsRewardsUser:!0,Balance:r,IsGiveUser:i})}else i(n.ErrorDetail)}else n.ErrorDetail&&n.ErrorDetail.ErrorCode===5003?t({IsRewardsUser:!1}):i(n.ErrorDetail);else i(null)}function s(t,r,f){let e={};e["X-Search-RPSToken"]=t;n.fetchUrlJson(i,e,u(),n=>o(n,r,f))}function h(t){return new Promise(r=>{let f={};f["X-Search-RPSToken"]=t;n.fetchUrlJson(i,f,u(),r)})}function c(t,i){const u=Object.assign(Object.assign({},r),i||{});return new Promise(i=>{n.fetchUrlJson(f,{"X-Search-RPSToken":t},JSON.stringify(u),i)})}function l(t,i){const u=Object.assign(Object.assign({},r),i);return new Promise(i=>{n.fetchUrlJson(e,{"X-Search-RPSToken":t},JSON.stringify(u),i)})}function u(n){let t={PartnerId:"WSB",Channel:"WSB"};return n&&(t.UserId=n),JSON.stringify(t)}const i="/msrewards/api/v1/getuserinfo",f="/msrewards/api/v1/user/create",e="/msrewards/api/v1/user/report",r={PartnerId:"WindowsSearchBox",Channel:"WSB"};t.getUserInfoAsync=s;t.getUserInfoAsyncPromise=h;t.createUserAsyncPromise=c;t.reportActivityAsyncPromise=l})(t=n.MsRewardsApi||(n.MsRewardsApi={}));let i;(function(t){function u(){}function i(n){return"RewardsPoints_"+n.accountUserName}function r(r){let e=i(r),u=n.LightweightStorage.getItem(e),f=u?+u:0;return f>t.NonMembersMaxPointsAccrued?t.NonMembersMaxPointsAccrued:f}function f(u,f){if(f>t.NonMembersMaxPointsAccrued&&(f=t.NonMembersMaxPointsAccrued),r(u)!=f){let t=i(u);return f?n.LightweightStorage.setItem(t,""+f):n.LightweightStorage.removeItem(t),!0}return!1}t.NonMembersMaxPointsAccrued=200;t.init=u;t.getBalance=r;t.setNewBalance=f})(i=n.MsRewardsNonMemberApi||(n.MsRewardsNonMemberApi={}))})(WSB||(WSB={}))