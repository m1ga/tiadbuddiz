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

		AdBuddiz.setPublisherKey(arg.getString("key"));
		AdBuddiz.cacheAds(appContext.getCurrentActivity());
	}

	@Kroll.method
	public void setTestMode(){
		AdBuddiz.setTestModeActive();
	}

	@Kroll.method
	public void showAd(){
		AdBuddiz.showAd(appContext.getCurrentActivity());
	}


}
