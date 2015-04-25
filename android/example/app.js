var ads = require("miga.adbuddiz");

ads.create({
    key:"YOUR_KEY",
    testMode:true,  // enable test mode
    showLog:true    // enable logs
});

function onClick(e){
    // show ad
    ads.showAd();
}

$.btn_open.addEventListener("click",onClick);
$.index.open();
