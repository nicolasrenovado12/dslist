package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {

	private long id;
	private String name;

	public GameListDTO() {
	}

	public GameListDTO(GameList gamelist) {
		id = gamelist.getId();
		name = gamelist.getName();
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
	
}
