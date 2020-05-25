package team.tit.gluttonoussnake.manager.impl;


/**
 * 
 * @ClassName: AnimationManager
 * @Description: TODO 动画管理器
 * @author: 陈思祥
 * @version: 1.3
 * @date: 2020年4月10日-下午9:19:34
 *
 */
public class AnimationManager {

	private static AnimationManager animationManager;
	
	
	private AnimationManager() {
		
	}

	public static AnimationManager getAnimationManager() {
		return animationManager;
	}
	
	public void onLaunch() {
		
		
	}
	public void onFinish() {
		System.out.println("Animation管理器退出");
	}
}