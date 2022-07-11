package GenericLibrary;

/**
 * This interface constins all the endpoints
 * @author Chaitra M
 *
 */
public interface EndPointsLibrary {
	
	String CreateProject = "/addProject";
	String GetProjects = "/projects";
	String UpdateProject = "/projects/";
	String DeleteProject = "/projects/";
	String GetSingleProject = "/projects/{pid}";

}
