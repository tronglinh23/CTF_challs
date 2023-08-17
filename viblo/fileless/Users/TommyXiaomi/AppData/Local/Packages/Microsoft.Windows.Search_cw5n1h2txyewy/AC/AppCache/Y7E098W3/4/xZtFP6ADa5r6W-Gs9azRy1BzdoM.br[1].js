var WSB;(function(n){function o(t){return n.config.useCobaltCSS&&r[t]?r[t]:n.config.enableShopSH1&&u[t]?u[t]:n.config.shGAWDx&&f[t]?f[t]:e[t]}function s(t){var r=o(t),i;return r?(i=n.getCurrentDate(),r.filter(function(t){return t.type===1?n.config.quickSearchMomentInTime&&(!t.validStart||i>=t.validStart)&&(!t.validEnd||i<t.validEnd):!0}).slice(0,n.config.maxStaticQuickSearches)):[]}var t={Weather:{type:2,content:"&#xE9C0"},News:{type:2,content:"&#xE900"},Movies:{type:2,content:"&#xE8B2"},MoviesTV:{type:2,content:"&#xEE6C"},History:{type:2,content:"&#xE823"},Quiz:{type:2,content:"&#xE7BE"},Info:{type:2,content:"&#xE946"},Financial:{type:2,content:"&#xE7BB"},Election:{type:1,content:"&#xEC08"},Shop:{type:1,content:"&#xE7BF"},Translate:{type:2,content:"&#xE7B2"},Sports:{type:2,content:"&#xEB22"},GoodNews:{type:2,content:"&#xE706"},Currency:{type:1,content:"&#xE8AB"}},i={Weather:"https://www.msn.com/weather?OCID=WSB_QS_WE&PC=wsbmsnqs",News:"https://www.msn.com/news?OCID=WSB_QS_NE&PC=wsbmsnqs",Sports:"https://www.msn.com/sports?OCID=WSB_TL_EL&PC=wsbmsnqs",Market:"https://www.msn.com/finance?OCID=WSB_TL_FN&PC=wsbmsnqs"},e={"de-de":[{type:0,query:"Wetter",tooltip:"Websuche nach dem Wetter",icon:t.Weather},{type:0,query:"Top-Nachrichten",tooltip:"Websuche nach Top-Nachrichten",icon:t.News},{type:0,query:"Übersetzen",tooltip:"Websuche nach Übersetzen",icon:t.Translate},{type:0,query:"Bing-Quizze",tooltip:"Websuche nach Bing-Quizze",icon:t.Quiz,serpURLParams:{filters:'IsConversation:"True"+BTWLType:"Quiz"'}}],"en-au":[{type:0,query:"Weather",tooltip:"Web search for weather",icon:t.Weather},{type:0,query:"Top news",tooltip:"Web search for top news",icon:t.News},{type:0,query:"New movies",tooltip:"Web search for new movies",icon:t.Movies},{type:0,query:"Bing quiz",tooltip:"Web search for Bing quiz",icon:t.Quiz,serpURLParams:{filters:'IsConversation:"True"+BTWLType:"Quiz"'}},],"en-ca":[{type:0,query:"Weather",tooltip:"Web search for weather",icon:t.Weather},{type:0,query:"Top news",tooltip:"Web search for top news",icon:t.News},{type:0,query:"Bing quiz",tooltip:"Web search for Bing quiz",icon:t.Quiz,serpURLParams:{filters:'IsConversation:"True"+BTWLType:"Quiz"'}}],"en-gb":[{type:0,query:"Weather",tooltip:"Web search for weather",icon:t.Weather},{type:0,query:"Top news",tooltip:"Web search for top news",icon:t.News},{type:0,query:"Today in history",tooltip:"Web search for today in history",icon:t.History},{type:0,query:"New movies",tooltip:"Web search for new movies",icon:t.Movies}],"en-in":[{type:0,query:"Weather",tooltip:"Web search for weather",icon:t.Weather},{type:0,query:"Top news",tooltip:"Web search for top news",icon:t.News},{type:0,query:"Translate",tooltip:"Web search for translate",icon:t.Translate},{type:0,query:"Bing quiz",tooltip:"Web search for Bing quiz",icon:t.Quiz,serpURLParams:{filters:'IsConversation:"True"+BTWLType:"Quiz"'}}],"en-us":[{type:0,query:"Weather",tooltip:"Web search for weather",icon:t.Weather},{type:0,query:"Top news",tooltip:"Web search for top news",icon:t.News},{type:0,query:"Today in history",tooltip:"Web search for today in history",icon:t.History},{type:0,query:"Coronavirus trends",tooltip:"Web search for coronavirus trends",icon:t.Info}],"es-es":[{type:0,query:"El tiempo hoy",tooltip:"Buscar en la Web por el clima de hoy",icon:t.Weather},{type:0,query:"Hoy en la historia",tooltip:"Buscar en la Web por hoy en la historia",icon:t.History},{type:0,query:"Películas en cartelera",tooltip:"Buscar en la Web por películas en cartelera",icon:t.Movies},{type:0,query:"Quiz de Bing",tooltip:"Buscar en la Web por Quiz de Bing",icon:t.Quiz,serpURLParams:{filters:'IsConversation:"True"+BTWLType:"Quiz"'}}],"es-mx":[{type:0,query:"El tiempo hoy",tooltip:"Buscar en la Web por el tiempo hoy",icon:t.Weather},{type:0,query:"Noticias",tooltip:"Buscar en la Web por noticias",icon:t.News},{type:0,query:"Películas en cartelera",tooltip:"Buscar en la Web por películas en cartelera",icon:t.Movies}],"fr-ca":[{type:0,query:"Météo",tooltip:"Recherche Web météo",icon:t.Weather},{type:0,query:"Actualités",tooltip:"Recherche Web des actualités à la une",icon:t.News},{type:0,query:"Meilleurs films",tooltip:"Recherche Web de nouveaux films",icon:t.Movies}],"fr-fr":[{type:0,query:"Météo",tooltip:"Recherche Web pour la météo",icon:t.Weather},{type:0,query:"Actualités",tooltip:"Recherche Web des actualités à la une",icon:t.News},{type:0,query:"Meilleurs films",tooltip:"Recherche sur le Web des meilleurs films",icon:t.Movies},{type:0,query:"Quiz Bing",tooltip:"Recherche Web pour le quiz Bing",icon:t.Quiz}],"it-it":[{type:0,query:"Meteo oggi",tooltip:"Cerca il meteo per oggi sul web",icon:t.Weather}],ja:[{type:0,query:"天気",tooltip:"天気を Web 検索",icon:t.Weather},{type:0,query:"トップニュース",tooltip:"トップ ニュースを Web 検索",icon:t.News},{type:0,query:"翻訳",tooltip:"翻訳を Web 検索",icon:t.Translate}],"ja-jp":[{type:0,query:"天気",tooltip:"天気を Web 検索",icon:t.Weather},{type:0,query:"トップニュース",tooltip:"トップ ニュースを Web 検索",icon:t.News},{type:0,query:"翻訳",tooltip:"翻訳を Web 検索",icon:t.Translate}],"nl-nl":[{type:0,query:"Nieuws",tooltip:"Nieuws op MSN",msnTooltip:"Nieuws op MSN",icon:t.News,msnUrl:i.News},{type:0,query:"Sport",tooltip:"Sport op MSN",msnTooltip:"Sport op MSN",icon:t.Sports,msnUrl:i.Sports},{type:0,query:"Geldzaken",tooltip:"Geldzaken op MSN",msnTooltip:"Geldzaken op MSN",icon:t.Financial,msnUrl:i.Market},{type:0,query:"Weer",tooltip:"Weer op MSN",msnTooltip:"Weer op MSN",icon:t.Weather,msnUrl:i.Weather}],"pt-br":[{type:0,query:"Tempo",tooltip:"Pesquisa na web do tempo",icon:t.Weather}],"zh-cn":[{type:0,query:"天气",tooltip:"在线搜索天气",icon:t.Weather},{type:0,query:"新闻",tooltip:"在线搜索新闻",icon:t.News}],"zh-hans-cn":[{type:0,query:"天气",tooltip:"在线搜索天气",icon:t.Weather},{type:0,query:"新闻",tooltip:"在线搜索新闻",icon:t.News}]},r={"de-de":[{type:0,query:"Bing-Quizze",tooltip:"Websuche nach Bing-Quizze",icon:t.Quiz,serpURLParams:{filters:'IsConversation:"True"+BTWLType:"Quiz"'}},{type:0,query:"Übersetzen",tooltip:"Websuche nach Übersetzen",icon:t.Translate},{type:0,query:"Währungsrechner",tooltip:"Websuche nach Währungsrechner",icon:t.Currency},],"en-au":[{type:0,query:"Today in history",tooltip:"Web search for today in history",icon:t.History},{type:0,query:"Markets today",tooltip:"Web search for markets today",icon:t.Financial},{type:0,query:"Translate",tooltip:"Web search for translate",icon:t.Translate},{type:0,query:"Currency converter",tooltip:"Web search for currency converter",icon:t.Currency},],"en-ca":[{type:0,query:"Today in history",tooltip:"Web search for today in history",icon:t.History},{type:0,query:"Markets today",tooltip:"Web search for markets today",icon:t.Financial},{type:0,query:"Translate",tooltip:"Web search for translate",icon:t.Translate},{type:0,query:"Currency converter",tooltip:"Web search for currency converter",icon:t.Currency},],"en-gb":[{type:0,query:"Today in history",tooltip:"Web search for today in history",icon:t.History},{type:0,query:"Markets today",tooltip:"Web search for markets today",icon:t.Financial},{type:0,query:"Translate",tooltip:"Web search for translate",icon:t.Translate},{type:0,query:"Currency converter",tooltip:"Web search for currency converter",icon:t.Currency},],"en-in":[{type:0,query:"Today in history",tooltip:"Web search for today in history",icon:t.History},{type:0,query:"Markets today",tooltip:"Web search for markets today",icon:t.Financial},{type:0,query:"Translate",tooltip:"Web search for translate",icon:t.Translate},{type:0,query:"Currency converter",tooltip:"Web search for currency converter",icon:t.Currency},],"en-us":[{type:0,query:"Today in history",tooltip:"Web search for today in history",icon:t.History},{type:0,query:"New movies",tooltip:"Web search for new movies",icon:t.MoviesTV},{type:0,query:"Translate",tooltip:"Web search for translate",icon:t.Translate},{type:0,query:"Markets today",tooltip:"Web search for markets today",icon:t.Financial}],"es-es":[{type:0,query:"Cotizaciones de hoy",tooltip:"Buscar en la Web por cotizaciones de hoy",icon:t.Currency},{type:0,query:"Quiz de Bing",tooltip:"Buscar en la Web por Quiz de Bing",icon:t.Quiz,serpURLParams:{filters:'IsConversation:"True"+BTWLType:"Quiz"'}},{type:0,query:"Traductor",tooltip:"Buscar en la Web por traductor",icon:t.Translate},{type:0,query:"Conversión de divisas",tooltip:"Buscar en la Web por conversión de divisas",icon:t.Currency},],"es-mx":[{type:0,query:"Traductor",tooltip:"Buscar en la Web por traductor",icon:t.Translate},{type:0,query:"Conversión de divisas",tooltip:"Buscar en la Web por conversión de divisas",icon:t.Currency},],"fr-ca":[{type:0,query:"Traduire",tooltip:"Recherche Web Traduire",icon:t.Translate},{type:0,query:"Convertisseur de devises",tooltip:"Recherche Web des convertisseur de devises",icon:t.Currency}],"fr-fr":[{type:0,query:"Traduire",tooltip:"Recherche Web pour traduire",icon:t.Translate},{type:0,query:"Convertisseur de devises",tooltip:"Recherche Web des convertisseur de devises",icon:t.Currency},{type:0,query:"Quiz Bing",tooltip:"Recherche Web pour le quiz Bing",icon:t.Quiz}],"it-it":[{type:0,query:"Traduttore",tooltip:"Cerca il traduttore sul web",icon:t.Translate},{type:0,query:"Convertitore di valuta",tooltip:"Cerca il convertitore di valuta sul web",icon:t.Currency},{type:0,query:"Andamento borsa",tooltip:"Cerca il andamento borsa sul web",icon:t.Financial}],ja:[{type:0,query:"翻訳",tooltip:"翻訳を Web 検索",icon:t.Translate},{type:0,query:"新型コロナウイルス(COVID-19)情報",tooltip:"新型コロナウイルス(COVID-19)情報を Web 検索",icon:t.Info}],"ja-jp":[{type:0,query:"翻訳",tooltip:"翻訳を Web 検索",icon:t.Translate},{type:0,query:"新型コロナウイルス(COVID-19)情報",tooltip:"新型コロナウイルス(COVID-19)情報を Web 検索",icon:t.Info}],"nl-nl":[{type:0,query:"Nieuws",tooltip:"Nieuws op MSN",msnTooltip:"Nieuws op MSN",icon:t.News,msnUrl:i.News},{type:0,query:"Sport",tooltip:"Sport op MSN",msnTooltip:"Sport op MSN",icon:t.Sports,msnUrl:i.Sports},{type:0,query:"Geldzaken",tooltip:"Geldzaken op MSN",msnTooltip:"Geldzaken op MSN",icon:t.Financial,msnUrl:i.Market},{type:0,query:"Weer",tooltip:"Weer op MSN",msnTooltip:"Weer op MSN",icon:t.Weather,msnUrl:i.Weather}],"pt-br":[{type:0,query:"Tradutor",tooltip:"Pesquisa na web por tradutor",icon:t.Translate},{type:0,query:"Conversor de moedas",tooltip:"Pesquisa na web por conversor de moedas",icon:t.Currency}],"zh-cn":[{type:0,query:"翻译",tooltip:"在线搜索翻译",icon:t.Translate},{type:0,query:"货币兑换",tooltip:"在线搜索货币兑换",icon:t.Currency}],"zh-hans-cn":[{type:0,query:"翻译",tooltip:"在线搜索翻译",icon:t.Translate},{type:0,query:"货币兑换",tooltip:"在线搜索货币兑换",icon:t.Currency}]},u={"de-de":[{type:0,query:"Wetter",tooltip:"Websuche nach dem Wetter",icon:t.Weather},{type:0,query:"Top-Nachrichten",tooltip:"Websuche nach Top-Nachrichten",icon:t.News},{type:0,query:"Beste Filme",tooltip:"Websuche nach besten Filmen",icon:t.Movies},{type:1,query:"Geschenke zum Valentinstag",tooltip:"Sie finden eine große Auswahl in diesem Shop",icon:t.Shop,validStart:new Date("2021-02-01T00:00:00.000"),validEnd:new Date("2021-02-16T00:00:00.000")},{type:0,query:"Bing-Quizze",tooltip:"Websuche nach Bing-Quizze",icon:t.Quiz,serpURLParams:{filters:'IsConversation:"True"+BTWLType:"Quiz"'}}],"en-au":[{type:0,query:"Weather",tooltip:"Web search for weather",icon:t.Weather},{type:0,query:"Top news",tooltip:"Web search for top news",icon:t.News},{type:0,query:"New movies",tooltip:"Web search for new movies",icon:t.Movies},{type:1,query:"Valentine's Day gifts",tooltip:"Shop Valentine's Day gift picks",icon:t.Shop,validStart:new Date("2021-02-01T00:00:00.000"),validEnd:new Date("2021-02-16T00:00:00.000")},{type:0,query:"Bing quiz",tooltip:"Web search for Bing quiz",icon:t.Quiz,serpURLParams:{filters:'IsConversation:"True"+BTWLType:"Quiz"'}},],"en-ca":[{type:0,query:"Weather",tooltip:"Web search for weather",icon:t.Weather},{type:0,query:"Top news",tooltip:"Web search for top news",icon:t.News},{type:0,query:"Bing quiz",tooltip:"Web search for Bing quiz",icon:t.Quiz,serpURLParams:{filters:'IsConversation:"True"+BTWLType:"Quiz"'}},{type:1,query:"Valentine's Day gifts",tooltip:"Shop Valentine's Day gift picks",icon:t.Shop,validStart:new Date("2021-02-01T00:00:00.000"),validEnd:new Date("2021-02-16T00:00:00.000")},],"en-gb":[{type:0,query:"Weather",tooltip:"Web search for weather",icon:t.Weather},{type:0,query:"Top news",tooltip:"Web search for top news",icon:t.News},{type:0,query:"Today in history",tooltip:"Web search for today in history",icon:t.History},{type:1,query:"Valentine's Day gifts",tooltip:"Shop Valentine's Day gift picks",icon:t.Shop,validStart:new Date("2021-02-01T00:00:00.000"),validEnd:new Date("2021-02-16T00:00:00.000")},{type:0,query:"New movies",tooltip:"Web search for new movies",icon:t.Movies}],"en-us":[{type:0,query:"Weather",tooltip:"Web search for weather",icon:t.Weather},{type:0,query:"Top news",tooltip:"Web search for top news",icon:t.News},{type:0,query:"Today in history",tooltip:"Web search for today in history",icon:t.History},{type:1,query:"Valentine's Day gifts",tooltip:"Shop Valentine's Day gift picks",icon:t.Shop,validStart:new Date("2021-02-01T00:00:00.000"),validEnd:new Date("2021-02-16T00:00:00.000")},{type:0,query:"Coronavirus trends",tooltip:"Web search for coronavirus trends",icon:t.Info}],"fr-fr":[{type:0,query:"Météo",tooltip:"Recherche Web pour la météo",icon:t.Weather},{type:0,query:"Actualités",tooltip:"Recherche Web des actualités à la une",icon:t.News},{type:0,query:"Meilleurs films",tooltip:"Recherche sur le Web des meilleurs films",icon:t.Movies},{type:1,query:"Cadeaux pour la Saint-Valentin",tooltip:"Découvrez une sélection de cadeaux pour les amoureux",icon:t.Shop,validStart:new Date("2021-02-01T00:00:00.000"),validEnd:new Date("2021-02-16T00:00:00.000")},{type:0,query:"Quiz Bing",tooltip:"Recherche Web pour le quiz Bing",icon:t.Quiz}]},f={"en-us":[{type:0,query:"Weather",tooltip:"Web search for weather",icon:t.Weather},{type:0,query:"Top news",tooltip:"Web search for top news",icon:t.News},{type:0,query:"Good news - MSN",tooltip:"Uplifting stories on MSN",icon:t.GoodNews},{type:0,query:"Coronavirus trends",tooltip:"Web search for coronavirus trends",icon:t.Info}]};n.getQuickAnswersTranslatedSuggestions=s})(WSB||(WSB={}))