package pl.edu.pw.mini.po.other.exceptions.costruction.constructionteam.welderteam;

import pl.edu.pw.mini.po.other.exceptions.costruction.constructionteam.ConstructionTeam;
import pl.edu.pw.mini.po.other.exceptions.costruction.constructionteam.Welder;

public class WelderTeam extends ConstructionTeam {

	@Override
	public void work() throws WelderTeamException {
		Welder welder = toolStorage.retrieveWelder();
		if(welder != null) {
			welder.weld();
		} else {
			throw new UkradliSpawarkeException("Nie ma wiec ukradli!");
		}

	}

}
