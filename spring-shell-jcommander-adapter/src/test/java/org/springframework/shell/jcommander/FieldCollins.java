/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.shell.jcommander;

import java.util.ArrayList;
import java.util.List;

import com.beust.jcommander.Parameter;

/**
 * A POJO with fields annotated with JCommander annotations.
 *
 * @author Eric Bottard
 * @see MyLordCommands#genesis(FieldCollins)
 */
public class FieldCollins {

	@Parameter(names = {"--name", "-n"}, description = "what's in a name?")
	private String name;

	@Parameter(names = "-level")
	private int level = 3;

	@Parameter(description = "rest")
	private List<String> rest = new ArrayList<>();

	public List<String> getRest() {
		return rest;
	}

	public void setRest(List<String> rest) {
		this.rest = rest;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
