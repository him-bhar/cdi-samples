/*
 * Copyright 2013 Himanshu Bhardwaj
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.test.pack;

import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Inject;
import javax.inject.Named;

/*@javax.faces.bean.ManagedBean(name="helloWorld")
@javax.enterprise.context.RequestScoped*/
//@Named("helloWorld")

@javax.faces.bean.ManagedBean(name="helloWorld")
@javax.enterprise.context.RequestScoped
public class HelloWorldBean {

	@Inject
	@Named("testCon")
	private TestConsumer test;

	private String name;

	// Getters and Setters

	// Logger LOG = LoggerFactory.getLogger(HelloWorldBean.class);

	public void convertNameToUpperCase2(AjaxBehaviorEvent event) {
		name = test.convertNameToUpperCase2(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
