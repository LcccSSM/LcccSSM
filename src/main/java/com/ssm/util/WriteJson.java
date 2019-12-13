package com.ssm.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WriteJson {

	public static void write(Object obj, HttpServletResponse resp) {

		try {
			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(obj);

			PrintWriter writer = resp.getWriter();
			writer.println(json);

		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

}
