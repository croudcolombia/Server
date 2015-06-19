package server;

import jobs.Job;

import org.springframework.data.mongodb.repository.MongoRepository;



public interface DBJobsManager extends MongoRepository<Job, String> {}


