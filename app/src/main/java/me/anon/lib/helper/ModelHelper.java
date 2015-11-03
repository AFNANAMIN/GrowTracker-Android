package me.anon.lib.helper;

/**
 * // TODO: Add class description
 *
 * @author 
 * @documentation // TODO Reference flow doc
 * @project GrowTracker
 */
public class ModelHelper
{
	/**
	 * Duplicates an object by serialising it as json and then deserialising it
	 *
	 * @param object The object to duplicate
	 *
	 * @return The duplicated object
	 */
	public static Object copy(Object object)
	{
		String json = GsonHelper.parse(object);
		return GsonHelper.parse(json, object.getClass());
	}
}
