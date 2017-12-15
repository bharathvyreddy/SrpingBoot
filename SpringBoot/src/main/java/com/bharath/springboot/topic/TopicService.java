package com.bharath.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic(1, "Spring", "Spring Desc"),
			new Topic(2, "Rest", "Rest Desc"),
			new Topic(3, "Angular", "Angular Desc")));

	public List<Topic> getAllTopics() {
		return topics ;
	}

	public Topic getTopic(String id) {
		// TODO Auto-generated method stub
		return topics.stream().filter(t -> (String.valueOf(t.getBookNumber())).equals(id)).findFirst().get();
	}

	public void insertTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
	}

	
			
}
