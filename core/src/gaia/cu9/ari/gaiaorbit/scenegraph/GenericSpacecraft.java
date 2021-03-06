/*
 * This file is part of Gaia Sky, which is released under the Mozilla Public License 2.0.
 * See the file LICENSE.md in the project root for full license details.
 */

package gaia.cu9.ari.gaiaorbit.scenegraph;

import gaia.cu9.ari.gaiaorbit.scenegraph.camera.ICamera;

/**
 * A generic spacecraft
 * 
 * @author tsagrista
 */
public class GenericSpacecraft extends Satellite {

    protected boolean renderQuad;

    /**
     * Adds this entity to the necessary render lists after the distance to the
     * camera and the view angle have been determined.
     */
    protected void addToRenderLists(ICamera camera) {
        super.addToRenderLists(camera);
        if (!renderQuad)
            super.removeFromRender(this, RenderGroup.BILLBOARD_SSO);
    }

    public void setRenderquad(String renderQuad) {
        this.renderQuad = Boolean.valueOf(renderQuad);
    }

}
