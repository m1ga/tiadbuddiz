package miga.adbuddiz;

import org.appcelerator.kroll.common.Log;
import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.kroll.KrollDict;
import java.util.HashMap;
import org.appcelerator.titanium.TiApplication;
import android.app.Activity;
import android.content.Context;
import java.io.IOException;
import com.purplebrain.adbuddiz.sdk.AdBuddiz;
import com.purplebrain.adbuddiz.sdk.AdBuddizLogLevel;


@Kroll.module(name="Adbuddiz", id="miga.adbuddiz")
public class AdbuddizModule extends KrollModule {

	TiApplication appContext;
	Activity activity;

	public AdbuddizModule() {
		super();
		appContext = TiApplication.getInstance();
		activity = appContext.getCurrentActivity();
	}

	@Kroll.method
	public void create(HashMap args){
		KrollDict arg = new KrollDict(args);
		boolean showLog = arg.optBoolean("showLog",false);
		boolean testMode = arg.optBoolean("testMode",false);

		AdBuddiz.setPublisherKey(arg.getString("key"));
		if (showLog){
			AdBuddiz.setLogLevel(AdBuddizLogLevel.Info);
		} else {
			AdBuddiz.setLogLevel(AdBuddizLogLevel.Silent);
		}
		if (testMode){
			AdBuddiz.setTestModeActive();
		}
		AdBuddiz.cacheAds(appContext.getCurrentActivity());
	}


	@Kroll.method
	public void setPublisherKey(String str){
		AdBuddiz.setPublisherKey(str);
	}


	@Kroll.method
	public void setTestModeActive(){
		AdBuddiz.setTestModeActive();
	}

	@Kroll.method
	public boolean isReadyToShowAd(){
		return AdBuddiz.isReadyToShowAd(appContext.getCurrentActivity());
	}

	@Kroll.method
	public void showLog(){
		AdBuddiz.setLogLevel(AdBuddizLogLevel.Info);
	}

	@Kroll.method
	public void cacheAds(){
		AdBuddiz.cacheAds(appContext.getCurrentActivity());
	}


	@Kroll.method
	public void showAd(){
		AdBuddiz.showAd(appContext.getCurrentActivity());
	}


}
