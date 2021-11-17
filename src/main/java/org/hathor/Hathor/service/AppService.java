package org.hathor.Hathor.service;

import org.hathor.Hathor.repository.appDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppService {
	@Autowired
	private appDAO appDAO;

	public appDAO getAppDAO() {
		return appDAO;
	}

	public void setAppDAO(appDAO appDAO) {
		this.appDAO = appDAO;
	}
}
