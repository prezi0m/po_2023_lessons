package pl.edu.pw.mini.po.other.exceptions.costruction;

import pl.edu.pw.mini.po.other.exceptions.costruction.constructionteam.welderteam.UkradliSpawarkeException;

public class ConstructionCompany {
	
	private ConstructionManager constructionManager = new ConstructionManager();
	
	public void runProject() throws ConstructionManagerException{
		constructionManager.runConstruction();
	}
	
}
