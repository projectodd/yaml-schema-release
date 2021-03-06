package org.projectodd.yaml.torquebox;

import org.junit.Before;
import org.projectodd.yaml.AbstractBaseTest;
import org.projectodd.yaml.Schema;
import org.projectodd.yaml.SchemaException;

public abstract class AbstractBaseTorqueBoxTest extends AbstractBaseTest {

    protected Schema schema;

    @Before
    public void before() throws SchemaException {
        schema = new Schema( loadResource( "schema.yml" ) );
    }

    @Override
    public String getType() {
        return "torquebox";
    }

}
