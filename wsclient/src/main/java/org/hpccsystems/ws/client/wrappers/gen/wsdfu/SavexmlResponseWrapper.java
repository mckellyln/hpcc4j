package org.hpccsystems.ws.client.wrappers.gen.wsdfu;



/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2021 HPCC Systems.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
import javax.activation.DataHandler;

/**
 * Generated Axis2 ADB stub class wrapper
 * WrapperMaker version: 1.7
 * Class name: SavexmlResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SavexmlResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * Service version: 1.64
 */
public class SavexmlResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected DataHandler local_xmlmap;

    public SavexmlResponseWrapper() {}

    public SavexmlResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SavexmlResponse savexmlresponse)
    {
        copy( savexmlresponse );
    }
    public SavexmlResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, DataHandler _xmlmap )
    {
        this.local_exceptions = _exceptions;
        this.local_xmlmap = _xmlmap;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SavexmlResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_xmlmap = raw.getXmlmap();

    }

    @Override
    public String toString()
    {
        return "SavexmlResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "xmlmap = " + local_xmlmap + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SavexmlResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SavexmlResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SavexmlResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setXmlmap( local_xmlmap);
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
    }
    public void setXmlmap( DataHandler _xmlmap )
    {
        this.local_xmlmap = _xmlmap;
    }
    public DataHandler getXmlmap( )
    {
        return this.local_xmlmap;
    }
}