var w = Ti.UI.createWindow();
var btn_open = Ti.UI.createButton({
	title : "show ad",
	width : "120dp",
	height : "60dp"
});
w.add(btn_open);


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

btn_open.addEventListener("click",onClick);
w.open();
