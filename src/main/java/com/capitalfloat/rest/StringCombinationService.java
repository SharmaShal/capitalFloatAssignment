package com.capitalfloat.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/string")
public class StringCombinationService {

	@GET
	@Path("/combinations")
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> getTrackInJSON(@QueryParam("string") String str) {

	    List<String> arrayList = new ArrayList<String>();
        char set[] = str.toCharArray();
        int n = set.length-1;

        for (int i = 0; i < (1<<n); i++)
        {
            String element = "";

            for (int j = 0; j < set.length; j++){
                element += set[j];
                if ((i & (1 << j)) > 0){
                        element +=".";
                }
        }

            arrayList.add(element);
        }
        return (arrayList);
	}	
}