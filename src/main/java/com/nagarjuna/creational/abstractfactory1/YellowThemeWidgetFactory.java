package com.nagarjuna.creational.abstractfactory1;

public class YellowThemeWidgetFactory implements WidgetFactory {

	@Override
	public ScrollBar createScrollBar() {
		return new YellowThemeScrollbar();
	}

	@Override
	public Window createWindow() {
		return new YellowThemeWindow();
	}

}
