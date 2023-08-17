- similar as go-gopher chall, except we can use our webhook site, because this chall checks URL: 

```go
	rawURL, _ := strings.CutPrefix(res.Dir.Items[2].Selector, "URL:")
	fmt.Println(rawURL)

	u, err := url.Parse(rawURL)

	etldpo, err2 := publicsuffix.EffectiveTLDPlusOne(u.Host)
	if err != nil || err2 != nil || etldpo != "amt.rs" {
		return "Invalid url"
	}
```








> `amateursCTF{ye5._ h1s_1s_g0pher_h3ll}`