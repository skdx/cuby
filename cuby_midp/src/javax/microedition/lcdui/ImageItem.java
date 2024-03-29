
package javax.microedition.lcdui;

/**
 * An item that can contain an image.
 *
 * <P> Each <code>ImageItem</code> object contains a reference to an
 * {@link Image} object.
 * This <code>Image</code> may be mutable or immutable.  If the
 * <code>Image</code> is mutable, the
 * effect is as if snapshot of its contents is taken at the time the
 * <code>ImageItem</code>
 * is constructed with this <code>Image</code> and when
 * <code>setImage</code> is called with an <code>Image</code>.
 * The snapshot is used whenever the contents of the
 * <code>ImageItem</code> are to be
 * displayed.  Even if the application subsequently draws into the
 * <code>Image</code>, the
 * snapshot is not modified until the next call to
 * <code>setImage</code>.  The snapshot is
 * <em>not</em> updated when the container of the
 * <code>ImageItem</code> becomes current or
 * becomes visible on the display.  (This is because the application does not
 * have control over exactly when <code>Displayables</code> and Items
 * appear and disappear
 * from the display.)</P>
 * 
 * <P>The value <code>null</code> may be specified for the image
 * contents of an <code>ImageItem</code>.
 * If
 * this occurs (and if the label is also <code>null</code>) the
 * <code>ImageItem</code> will occupy no
 * space on the screen. </p>
 *
 * <p><code>ImageItem</code> contains layout directives that were
 * originally defined in
 * MIDP 1.0.  These layout directives have been moved to the
 * {@link Item} class and now apply to all items.  The declarations are left 
 * in <code>ImageItem</code> for source compatibility purposes.</p>
 * 
 * <P>The <code>altText</code> parameter specifies a string to be
 * displayed in place of the
 * image if the image exceeds the capacity of the display. The
 * <code>altText</code>
 * parameter may be <code>null</code>.</P>
 *
 * @since MIDP 1.0
 */

public class ImageItem extends Item {

    /**
     * Creates a new <code>ImageItem</code> with the given label, image, layout
     * directive, and alternate text string.  Calling this constructor is 
     * equivalent to calling 
     *
     * <TABLE BORDER="2">
     * <TR>
     * <TD ROWSPAN="1" COLSPAN="1">
     *    <pre><code>
     *    ImageItem(label, image, layout, altText, PLAIN);     </code></pre>
     * </TD>
     * </TR>
     * </TABLE>
     * @param label the label string
     * @param img the image, can be mutable or immutable
     * @param layout a combination of layout directives
     * @param altText the text that may be used in place of the image
     * @throws IllegalArgumentException if the <code>layout</code> value is not
     * a legal combination of directives
     * @see #ImageItem(String, Image, int, String, int)
     */
    public ImageItem(String label, Image img, int layout, String altText) {
        this(label, img, layout, altText, PLAIN);
    }

    /**
     * Creates a new <code>ImageItem</code> object with the given label, image,
     * layout directive, alternate text string, and appearance mode.
     * Either label or alternative text may be present or <code>null</code>.
     *
     * <p>The <code>appearanceMode</code> parameter
     * (see <a href="Item.html#appearance">Appearance Modes</a>)
     * is a hint to the platform of the application's intended use
     * for this <code>ImageItem</code>. To provide hyperlink- or
     * button-like behavior,
     * the application should associate a default <code>Command</code> with this
     * <code>ImageItem</code> and add an
     * <code>ItemCommandListener</code> to this
     * <code>ImageItem</code>.
     * 
     * <p>Here is an example showing the use of an
     * <code>ImageItem</code> as a button: <p>
     * <TABLE BORDER="2">
     * <TR>
     * <TD ROWSPAN="1" COLSPAN="1">
     *    <pre><code>
     *     ImageItem imgItem = 
     *         new ImageItem("Default: ", img,     
     *                       Item.LAYOUT_CENTER, null,    
     *                       Item.BUTTON);    
     *     imgItem.setDefaultCommand(
     *         new Command("Set", Command.ITEM, 1); 
     *     // icl is ItemCommandListener   
     *     imgItem.setItemCommandListener(icl);      </code></pre>
     * </TD>
     * </TR>
     * </TABLE>
     *
     * @param label the label string
     * @param image the image, can be mutable or immutable
     * @param layout a combination of layout directives
     * @param altText the text that may be used in place of the image
     * @throws IllegalArgumentException if the <code>layout</code> value is not
     * a legal combination of directives
     * @param appearanceMode the appearance mode of the <code>ImageItem</code>,
     * one of {@link #PLAIN}, {@link #HYPERLINK}, or {@link #BUTTON}
     * @throws IllegalArgumentException if <code>appearanceMode</code> invalid
     *
     */
    public ImageItem(String label, Image image, int layout, String altText,
                     int appearanceMode) {
        

      
    }

    /**
     * Gets the image contained within the <code>ImageItem</code>, or
     * <code>null</code> if there is no
     * contained image.
     * @return image used by the <code>ImageItem</code>
     * @see #setImage
     */
    public Image getImage() {
    	return null;
    }

    /**
     * Sets the <code>Image</code> object contained within the
     * <code>ImageItem</code>.  The image may be
     * mutable or immutable.  If <code>img</code> is
     * <code>null</code>, the <code>ImageItem</code> is set to be
     * empty.  If <code>img</code> is mutable, the effect is as if a
     * snapshot is taken of
     * <code>img's</code> contents immediately prior to the call to
     * <code>setImage</code>.  This
     * snapshot is used whenever the contents of the
     * <code>ImageItem</code> are to be
     * displayed.  If <code>img</code> is already the
     * <code>Image</code> of this <code>ImageItem</code>, the effect
     * is as if a new snapshot of img's contents is taken.  Thus, after 
     * painting into a mutable image contained by an
     * <code>ImageItem</code>, the
     * application can call 
     * 
     * <TABLE BORDER="2">
     * <TR>
     * <TD ROWSPAN="1" COLSPAN="1">
     *    <pre><code>
     *    imageItem.setImage(imageItem.getImage());       </code></pre>
     * </TD>
     * </TR>
     * </TABLE>
     *
     * <p>to refresh the <code>ImageItem's</code> snapshot of its Image.</p>
     *
     * <p>If the <code>ImageItem</code> is visible on the display when
     * the snapshot is
     * updated through a call to <code>setImage</code>, the display is
     * updated with the new
     * snapshot as soon as it is feasible for the implementation to so do.</p>
     *
     * @param img the <code>Image</code> for this
     * <code>ImageItem</code>, or <code>null</code> if none
     * @see #getImage
     */
    public void setImage(Image img) {
       
    }

    /**
     * Gets the text string to be used if the image exceeds the device's
     * capacity to display it.
     *
     * @return the alternate text value, or <code>null</code> if none
     * @see #setAltText
     */
    public String getAltText() { 

        return null;
    }

    /**
     * Sets the alternate text of the <code>ImageItem</code>, or
     * <code>null</code> if no alternate text is provided.
     * @param text the new alternate text
     * @see #getAltText
     */
    public void setAltText(String text) {
    
    }

    /**
     * Gets the layout directives used for placing the image.
     * @return a combination of layout directive values
     * @see #setLayout
     */
    public int getLayout() {
        // NOTE: looks odd, but this method is required for 1.0 compatibility
        return super.getLayout();
    }

    /**
     * Sets the layout directives.
     * @param layout a combination of layout directive values
     * @throws IllegalArgumentException if the value of <code>layout</code>
     * is not a valid
     * combination of layout directives
     * @see #getLayout
     */
    public void setLayout(int layout) {
        // NOTE: looks odd, but this method is required for 1.0 compatibility
        super.setLayout(layout);
    }

    /** 
     * Returns the appearance mode of the <code>ImageItem</code>.
     * See <a href="Item.html#appearance">Appearance Modes</a>.
     *
     * @return the appearance mode value,
     * one of {@link #PLAIN}, {@link #HYPERLINK}, or {@link #BUTTON}
     * 
     */
    public int getAppearanceMode() {
    	return 0;
    }

}
