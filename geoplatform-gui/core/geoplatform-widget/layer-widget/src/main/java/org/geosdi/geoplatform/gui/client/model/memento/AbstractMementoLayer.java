/*
 *  geo-platform
 *  Rich webgis framework
 *  http://geo-platform.org
 * ====================================================================
 *
 * Copyright (C) 2008-2011 geoSDI Group (CNR IMAA - Potenza - ITALY).
 *
 * This program is free software: you can redistribute it and/or modify it 
 * under the terms of the GNU General Public License as published by 
 * the Free Software Foundation, either version 3 of the License, or 
 * (at your option) any later version. This program is distributed in the 
 * hope that it will be useful, but WITHOUT ANY WARRANTY; without 
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR 
 * A PARTICULAR PURPOSE. See the GNU General Public License 
 * for more details. You should have received a copy of the GNU General 
 * Public License along with this program. If not, see http://www.gnu.org/licenses/ 
 *
 * ====================================================================
 *
 * Linking this library statically or dynamically with other modules is 
 * making a combined work based on this library. Thus, the terms and 
 * conditions of the GNU General Public License cover the whole combination. 
 * 
 * As a special exception, the copyright holders of this library give you permission 
 * to link this library with independent modules to produce an executable, regardless 
 * of the license terms of these independent modules, and to copy and distribute 
 * the resulting executable under terms of your choice, provided that you also meet, 
 * for each linked independent module, the terms and conditions of the license of 
 * that module. An independent module is a module which is not derived from or 
 * based on this library. If you modify this library, you may extend this exception 
 * to your version of the library, but you are not obligated to do so. If you do not 
 * wish to do so, delete this exception statement from your version. 
 *
 */
package org.geosdi.geoplatform.gui.client.model.memento;

import org.geosdi.geoplatform.gui.action.ISave;
import org.geosdi.geoplatform.gui.client.model.FolderTreeNode;
import org.geosdi.geoplatform.gui.configuration.map.client.layer.GPLayerType;
import org.geosdi.geoplatform.gui.model.tree.GPLayerTreeModel;

/**
 * @author Nazzareno Sileno - CNR IMAA geoSDI Group
 * @email nazzareno.sileno@geosdi.org
 */
public abstract class AbstractMementoLayer<T extends GPLayerTreeModel> extends AbstractMementoSave<T> {

    private static final long serialVersionUID = -3151230290345781610L;
    private String layerName;
    private int zIndex;
    private transient FolderTreeNode refParent;
    private long idFolderParent;
    private String abstractText;
    private String title;
    private String alias;
    private float opacity;
    private String dataSource;
    private String srs;
    /* GPBBox elements */
    private double lowerLeftX;
    private double lowerLeftY;
    private double upperRightX;
    private double upperRightY;
    private GPLayerType layerType;
    private boolean checked;

    public AbstractMementoLayer(ISave saveAction) {
        super(saveAction);
    }

    public AbstractMementoLayer() {
    }

    @Override
    public void convertMementoToWs() {
        System.out.println("Converting abstract memento layer for ws");
        super.convertMementoToWs();
        if (this.getRefParent() != null) {
            this.idFolderParent = this.refParent.getId();
        }
    }

    public String getAbstractText() {
        return abstractText;
    }

    public void setAbstractText(String abstractText) {
        this.abstractText = abstractText;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getLayerName() {
        return layerName;
    }

    public void setLayerName(String layerName) {
        this.layerName = layerName;
    }
    
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public float getOpacity() {
        return opacity;
    }

    public void setOpacity(float opacity) {
        this.opacity = opacity;
    }

    public GPLayerType getLayerType() {
        return layerType;
    }

    public void setLayerType(GPLayerType layerType) {
        this.layerType = layerType;
    }

    public double getLowerLeftX() {
        return lowerLeftX;
    }

    public void setLowerLeftX(double lowerLeftX) {
        this.lowerLeftX = lowerLeftX;
    }

    public double getLowerLeftY() {
        return lowerLeftY;
    }

    public void setLowerLeftY(double lowerLeftY) {
        this.lowerLeftY = lowerLeftY;
    }

    public String getSrs() {
        return srs;
    }

    public void setSrs(String srs) {
        this.srs = srs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getUpperRightX() {
        return upperRightX;
    }

    public void setUpperRightX(double upperRightX) {
        this.upperRightX = upperRightX;
    }

    public double getUpperRightY() {
        return upperRightY;
    }

    public void setUpperRightY(double upperRightY) {
        this.upperRightY = upperRightY;
    }

    public int getzIndex() {
        return zIndex;
    }

    public void setzIndex(int zIndex) {
        this.zIndex = zIndex;
    }

    public long getIdFolderParent() {
        return idFolderParent;
    }

    public void setIdFolderParent(long idFolderParent) {
        this.idFolderParent = idFolderParent;
    }

    /**
     * @return the refParent
     */
    public FolderTreeNode getRefParent() {
        return refParent;
    }

    /**
     * @param refParent the refParent to set
     */
    public void setRefParent(FolderTreeNode refParent) {
        this.refParent = refParent;
    }
}
