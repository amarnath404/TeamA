package org.techgene.mvc.util;

import org.springframework.stereotype.Component;

@Component

public class AccNumGen 
{
	public static  long  getNum() 
	{
		 int num=0;
		 num=(int)((Math.random()*90000000)+100000000);
		 return num;
	}

}
