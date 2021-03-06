/*
 *  geo-platform
 *  Rich webgis framework
 *  http://geo-platform.org
 * ====================================================================
 *
 * Copyright (C) 2008-2014 geoSDI Group (CNR IMAA - Potenza - ITALY).
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
package org.geosdi.geoplatform.support.cxf.rs.provider.factory;

import org.geosdi.geoplatform.support.cxf.rs.provider.configurator.GPRestProviderType;
import static org.geosdi.geoplatform.support.cxf.rs.provider.configurator.GPRestProviderType.JACKSON;
import static org.geosdi.geoplatform.support.cxf.rs.provider.configurator.GPRestProviderType.JETTYSON;
import org.geosdi.geoplatform.support.cxf.rs.provider.jackson.GPJacksonProvider;
import org.geosdi.geoplatform.support.cxf.rs.provider.jettyson.GPJSONProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
public final class GPRestProviderFactory {

    static final GPRestProviderType DEFAULT_TYPE = GPRestProviderType.JETTYSON;

    private static final Logger logger = LoggerFactory.getLogger(
            GPRestProviderFactory.class);

    private GPRestProviderFactory() {
    }

    public static Object createProvider(GPRestProviderType type) {
        switch ((type != null) ? type : DEFAULT_TYPE) {
            case JACKSON:
                logger.debug(
                        "\n\n############################### RestProviderFactory "
                        + "is building an instance of {}\n\n",
                        GPJacksonProvider.class);
                return new GPJacksonProvider();

            case JETTYSON:
                logger.debug("\n\n############################### "
                        + "RestProviderFactory is building an instance of {}\n\n",
                        GPJSONProvider.class);
                return new GPJSONProvider<>();

            default:
                logger.debug("\n\n############################### "
                        + "RestProviderFactory DEFAULT Provider instance of {}\n\n",
                        GPJSONProvider.class);
                return new GPJSONProvider<>();
        }
    }

}
