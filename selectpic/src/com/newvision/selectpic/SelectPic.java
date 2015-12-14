package com.newvision.selectpic;

import android.content.Intent;

import com.unity3d.player.UnityPlayer;

public class SelectPic
{
	public static void GoToDCIM()
	{
		UnityPlayer.currentActivity.runOnUiThread(new Runnable()
		{
			
			@Override
			public void run()
			{
				Intent intent = new Intent();
				
			}
		});
	}
}
