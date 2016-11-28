package koreatech.cse.domain;
import java.sql.Date;
//package koreatech.cse.domain;

/**
 * Created by Yimo on 2016-10-27.
 */
public class Temperature {

        private int id;
        private String sensorId;
        private float temperature;
        private Date datetime;
        private String location;
        public int getId()
        {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSensorId() {
            return sensorId;
        }

        public void setSensorId(String sensorId) {
            this.sensorId = sensorId;
        }

        public float getTemperature() {
            return temperature;
        }

        public void setTemperature(float temperature) {
            this.temperature = temperature;
        }

        public Date getDatetime() {
            return datetime;
        }

        public void setDatetime(Date datetime) {
            this.datetime = datetime;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }
    }

