package net.floodlightcontroller.statistics;

import org.restlet.Context;
import org.restlet.Restlet;
import org.restlet.routing.Router;

import net.floodlightcontroller.restserver.RestletRoutable;

public class PktInHistoryWebRoutable implements RestletRoutable {

	@Override
	public Restlet getRestlet(Context context) {
		Router router = new Router(context);
		router.attach("/pktinhistory/json", PktInHistoryResource.class);
		return router;
	}

	@Override
	public String basePath() {
		return "/wm/statics";
	}

}
