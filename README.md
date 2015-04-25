Titanium module for AdBuddiz (Android)

Binary inside android/dist/ folder


Example:

```
var ads = require("miga.adbuddiz");

ads.create({
    key:"YOUR_KEY"
});

// enable test mode
ads.setTestMode();

function onClick(e){
    // show ad
    ads.showAd();
}

$.btn_open.addEventListener("click",onClick);
$.index.open();
```
