# ThemeSwitcher

`XML`

To create multiple themes, we need to create a `themes.xml`, `attrs.xml`, and `styles.xml` files if not already present in `res/values` folder


In `attrs.xml`, we mention the attributes to which the reference will be made

For example, 

```
<resources>
    <attr name="pageBackground" format="reference" />
    <attr name="`" format="reference"/>
</resources>
```

The attr names such as `pageBackground` will be used added as a attribute to the views in the layout file as you will later. The attr name will also be used in the `themes.xml` file to map the style.

To give an example consider the `activity_main.xml` in this project where we have the parent layout as Constraint Layout and three button views. We are changing the background color of the layout and the text colors of the three buttons. 

We have added `style="?buttonTextColor"` to the button view in the layout. Now, when the style is rendered, the OS will go to the `themes.xml` file, go to the current theme, where it will check the attrs and render the associated style against that theme

In `styles.xml` we create the different styles we need for our views.
In `themes.xml` we combine all the styles we want under a theme mapped with the attrivutes mentioned in the `attrs.xml` file.

`CODE`

Activity contains an API `setTheme(int resId)` which sets the theme we need. This API must be called before `setContentView()`
