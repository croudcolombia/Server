package server;

import java.util.ArrayList;
import java.util.List;

import jobs.Job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class ServerController {

	@Autowired
	private DBJobsManager repo;

	
	@RequestMapping(value="/jobs" , method=RequestMethod.GET)	
	public List<Job> getAll() {
		return repo.findAll();
	}

	@RequestMapping(value="/jobs" , method=RequestMethod.POST)	
	public ResponseEntity<Job> create(@RequestBody Job Job){
		return new ResponseEntity<Job>( repo.save(Job),HttpStatus.ACCEPTED);
	}
	
	
	
}
