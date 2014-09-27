/**
*  2014-9-26
*  2014
   201638
*
*/

package com.xiao;

/**  
 *@author 201638
 *@date   2014-9-26
 */
public class Office {
	/**
	 *2014-9-26
	 *Office.java
	 *
	 */
	public static void main(String[] args) {
		try {
			Class c = Class.forName("com.xiao." + args[0]);
			OfficeAbstract oa = (OfficeAbstract)c.newInstance();
			oa.start();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
