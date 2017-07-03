Titanium module for AdBuddiz (Android)

Binary inside android/dist/ folder

![ScreenShot](https://raw.github.com/m1ga/tiadbuddiz/master/android/example/screen.png)

Example:



```javascript
var ads = require("miga.adbuddiz");
ads.setPublisherKey("YOUR_KEY");    // set key
ads.setTestModeActive();            // optional - set test mode
ads.showLog();                      // optional - show log
ads.cacheAds();                     // start
ads.showAd();                       // show ad

if (ads.isReadyToShowAd()){         // optional - ready to show ad
    //
}
```

old syntax (still supported):

```javascript
var ads = require("miga.adbuddiz");

ads.create({
    key:"YOUR_KEY",
    testMode:true,  // enable test mode
    showLog:true    // enable logs
});

ads.showAd();     // show ad

```
