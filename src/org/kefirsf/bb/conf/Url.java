package org.kefirsf.bb.conf;

/**
 * The URL pattern element.
 *
 * @author kefir
 */
public class Url extends NamedElement implements PatternElement {
    private boolean ghost = false;

    /**
     * Accept local URLs.
     */
    private boolean local = false;

    /**
     * Accept URLs without a schema. This URL can't be terminator and can't accept URLs with a schema.
     */
    private boolean schemaless = false;

    /**
     * Create an URL pattern element.
     *
     * @param name  variable name
     * @param ghost is it ghost?
     */
    public Url(String name, boolean ghost, boolean local, boolean schemaless) {
        super(name);
        this.ghost = ghost;
        this.local = local;
        this.schemaless = schemaless;
    }

    /**
     * If it's true then processor parse it but no move the cursor.
     *
     * @return is it ghost or no
     */
    public boolean isGhost() {
        return ghost;
    }

    /**
     * @param ghost If it's true then processor parse it but no move the cursor.
     */
    public void setGhost(boolean ghost) {
        this.ghost = ghost;
    }

    /**
     * Local URLs a URLs without a schema and host
     *
     * @return true - if the URL can accept local URLs also,
     * false - if URL must be absolute.
     */
    public boolean isLocal() {
        return local;
    }

    /**
     * Set support local URLs.
     * <p/>
     * true - if the URL can accept local URLs also,
     * false - if URL must be absolute.
     *
     * @param local new value
     */
    public void setLocal(boolean local) {
        this.local = local;
    }

    /**
     * Is it URL without a schema? Like www.example.com
     *
     * @return true if accept URLs only without a schema, false otherwise
     */
    public boolean isSchemaless() {
        return schemaless;
    }

    /**
     * Set this is URL with schema or not?
     *
     * @param schemaless if true then without schema.
     */
    public void setSchemaless(boolean schemaless) {
        this.schemaless = schemaless;
    }
}
