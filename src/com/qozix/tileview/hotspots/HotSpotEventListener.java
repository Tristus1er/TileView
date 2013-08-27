package com.qozix.tileview.hotspots;

public interface HotSpotEventListener {
	public void onHotSpotTap( HotSpot hotSpot, int x, int y );
	public void onHotSpotLongTap( HotSpot hotSpot, int x, int y );
}
