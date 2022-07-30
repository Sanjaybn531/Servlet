package com.xworkz.ott.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OttDTO {
	
	private String ottName;
	private String region;
	private String language;
	private String subscriptionPlan;
	private int since;
	private String users;
	private boolean activePlan;
}
