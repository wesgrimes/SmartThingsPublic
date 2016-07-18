/*
 *  Audio Switch
 *
 *  Author: Wes Grimes
 *  Date: 2016-07-14
 *  Revision: 2016-07-10
 *  Capabilities:
 *   Actuator
 *   Sensor
 *  Custom Attributes:
 *   
 *  Custom Commands
 *   
 */
 

 
metadata {
    //preferences {
    //    section ("Zone Labels") {
    //        input name: "zone1Label", type: "text", title: "Zone 1 Label", description: "Enter the label for Zone 1", required: true
    //    }
    //}

	definition (name: "Audio Switch", namespace: "wesgrimes", author: "Wes Grimes") {
    		capability "Actuator"
            capability "Sensor"
            
            attribute "zoneEnabled01", "string"
            attribute "zoneEnabled02", "string"
            attribute "zoneEnabled03", "string"
            attribute "zoneEnabled04", "string"
            attribute "zoneEnabled05", "string"
            attribute "zoneEnabled06", "string"
            attribute "zoneEnabled07", "string"
            attribute "zoneEnabled08", "string"
            attribute "zoneEnabled09", "string"
            attribute "zoneEnabled10", "string"

            attribute "zoneSource01", "string"
            attribute "zoneSource02", "string"
            attribute "zoneSource03", "string"
            attribute "zoneSource04", "string"
            attribute "zoneSource05", "string"
            attribute "zoneSource06", "string"
            attribute "zoneSource07", "string"
            attribute "zoneSource08", "string"
            attribute "zoneSource09", "string"
            attribute "zoneSource10", "string"

            attribute "zoneLevel01", "number"
            attribute "zoneLevel02", "number"
            attribute "zoneLevel03", "number"
            attribute "zoneLevel04", "number"
            attribute "zoneLevel05", "number"
            attribute "zoneLevel06", "number"
            attribute "zoneLevel07", "number"
            attribute "zoneLevel08", "number"
            attribute "zoneLevel09", "number"
            attribute "zoneLevel10", "number"

            command "setZoneEnabled01_On"
            command "setZoneEnabled02_On"
            command "setZoneEnabled03_On"
            command "setZoneEnabled04_On"
            command "setZoneEnabled05_On"
            command "setZoneEnabled06_On"
            command "setZoneEnabled07_On"
            command "setZoneEnabled08_On"
            command "setZoneEnabled09_On"
            command "setZoneEnabled10_On"
            
            command "setZoneEnabled01_Off"
            command "setZoneEnabled02_Off"
            command "setZoneEnabled03_Off"
            command "setZoneEnabled04_Off"
            command "setZoneEnabled05_Off"
            command "setZoneEnabled06_Off"
            command "setZoneEnabled07_Off"
            command "setZoneEnabled08_Off"
            command "setZoneEnabled09_Off"
            command "setZoneEnabled10_Off"
            
            command "setZoneSource011"
            command "setZoneSource012"
            command "setZoneSource013"
            command "setZoneSource014"
            command "setZoneSource015"
            command "setZoneSource016"
            command "setZoneSource017"
            command "setZoneSource018"
            command "setZoneSource021"
            command "setZoneSource022"
            command "setZoneSource023"
            command "setZoneSource024"
            command "setZoneSource025"
            command "setZoneSource026"
            command "setZoneSource027"
            command "setZoneSource028"
            command "setZoneSource031"
            command "setZoneSource032"
            command "setZoneSource033"
            command "setZoneSource034"
            command "setZoneSource035"
            command "setZoneSource036"
            command "setZoneSource037"
            command "setZoneSource038"
            command "setZoneSource041"
            command "setZoneSource042"
            command "setZoneSource043"
            command "setZoneSource044"
            command "setZoneSource045"
            command "setZoneSource046"
            command "setZoneSource047"
            command "setZoneSource048"
            command "setZoneSource051"
            command "setZoneSource052"
            command "setZoneSource053"
            command "setZoneSource054"
            command "setZoneSource055"
            command "setZoneSource056"
            command "setZoneSource057"
            command "setZoneSource058"
            command "setZoneSource061"
            command "setZoneSource062"
            command "setZoneSource063"
            command "setZoneSource064"
            command "setZoneSource065"
            command "setZoneSource066"
            command "setZoneSource067"
            command "setZoneSource068"
            command "setZoneSource071"
            command "setZoneSource072"
            command "setZoneSource073"
            command "setZoneSource074"
            command "setZoneSource075"
            command "setZoneSource076"
            command "setZoneSource077"
            command "setZoneSource078"
            command "setZoneSource081"
            command "setZoneSource082"
            command "setZoneSource083"
            command "setZoneSource084"
            command "setZoneSource085"
            command "setZoneSource086"
            command "setZoneSource087"
            command "setZoneSource088"
            command "setZoneSource091"
            command "setZoneSource092"
            command "setZoneSource093"
            command "setZoneSource094"
            command "setZoneSource095"
            command "setZoneSource096"
            command "setZoneSource097"
            command "setZoneSource098"
            command "setZoneSource101"
            command "setZoneSource102"
            command "setZoneSource103"
            command "setZoneSource104"
            command "setZoneSource105"
            command "setZoneSource106"
            command "setZoneSource107"
            command "setZoneSource108"
            command "setZoneLevel01"
            command "setZoneLevel02"
            command "setZoneLevel03"
            command "setZoneLevel04"
            command "setZoneLevel05"
            command "setZoneLevel06"
            command "setZoneLevel07"
            command "setZoneLevel08"
            command "setZoneLevel09"
            command "setZoneLevel10"
	}

	tiles(scale: 2) {
		valueTile("message", "device.greeting", width: 2, height:2, inactiveLabel: false) {
        	state "message", label:'Configure', icon: "st.Electronics.electronics19"
        	//state "message", label:'${currentValue}', unit:""
		}

		standardTile("zoneEnabled01_Switch", "zoneEnabled01", width: 2, height: 2, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "Zone 1", action: "setZoneEnabled01_On", backgroundColor: "#ffffff", icon: "st.Electronics.electronics14", nextState: "On_Trans"
			state "1", label: "Zone 1", action: "setZoneEnabled01_Off", backgroundColor: "#79b821", icon: "st.Electronics.electronics14", nextState: "Off_Trans"
            state "On_Trans", label: "Working", backgroundColor:"#ddf4be", icon: "st.Electronics.electronics14", nextState: "1"
            state "Off_Trans", label: "Working", backgroundColor:"#ddf4be", icon: "st.Electronics.electronics14", nextState: "0"
		}

		standardTile("zoneEnabled02_Switch", "zoneEnabled02", width: 2, height: 2, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "Zone 2", action: "setZoneEnabled02_On", backgroundColor: "#ffffff", icon: "st.Electronics.electronics14", nextState: "On_Trans"
			state "1", label: "Zone 2", action: "setZoneEnabled02_Off", backgroundColor: "#79b821", icon: "st.Electronics.electronics14", nextState: "Off_Trans"
            state "On_Trans", label: "Working", backgroundColor:"#ddf4be", icon: "st.Electronics.electronics14", nextState: "1"
            state "Off_Trans", label: "Working", backgroundColor:"#ddf4be", icon: "st.Electronics.electronics14", nextState: "0"
		}

		standardTile("zoneEnabled03_Switch", "zoneEnabled03", width: 2, height: 2, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "Zone 3", action: "setZoneEnabled03_On", backgroundColor: "#ffffff", icon: "st.Electronics.electronics14", nextState: "On_Trans"
			state "1", label: "Zone 3", action: "setZoneEnabled03_Off", backgroundColor: "#79b821", icon: "st.Electronics.electronics14", nextState: "Off_Trans"
            state "On_Trans", label: "Working", backgroundColor:"#ddf4be", icon: "st.Electronics.electronics14", nextState: "1"
            state "Off_Trans", label: "Working", backgroundColor:"#ddf4be", icon: "st.Electronics.electronics14", nextState: "0"
		}

		standardTile("zoneEnabled04_Switch", "zoneEnabled04", width: 2, height: 2, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "Zone 4", action: "setZoneEnabled04_On", backgroundColor: "#ffffff", icon: "st.Electronics.electronics14", nextState: "On_Trans"
			state "1", label: "Zone 4", action: "setZoneEnabled04_Off", backgroundColor: "#79b821", icon: "st.Electronics.electronics14", nextState: "Off_Trans"
            state "On_Trans", label: "Working", backgroundColor:"#ddf4be", icon: "st.Electronics.electronics14", nextState: "1"
            state "Off_Trans", label: "Working", backgroundColor:"#ddf4be", icon: "st.Electronics.electronics14", nextState: "0"
		}

		standardTile("zoneEnabled05_Switch", "zoneEnabled05", width: 2, height: 2, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "Zone 5", action: "setZoneEnabled05_On", backgroundColor: "#ffffff", icon: "st.Electronics.electronics14", nextState: "On_Trans"
			state "1", label: "Zone 5", action: "setZoneEnabled05_Off", backgroundColor: "#79b821", icon: "st.Electronics.electronics14", nextState: "Off_Trans"
            state "On_Trans", label: "Working", backgroundColor:"#ddf4be", icon: "st.Electronics.electronics14", nextState: "1"
            state "Off_Trans", label: "Working", backgroundColor:"#ddf4be", icon: "st.Electronics.electronics14", nextState: "0"
		}

		standardTile("zoneEnabled06_Switch", "zoneEnabled06", width: 2, height: 2, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "Zone 6", action: "setZoneEnabled06_On", backgroundColor: "#ffffff", icon: "st.Electronics.electronics14", nextState: "On_Trans"
			state "1", label: "Zone 6", action: "setZoneEnabled06_Off", backgroundColor: "#79b821", icon: "st.Electronics.electronics14", nextState: "Off_Trans"
            state "On_Trans", label: "Working", backgroundColor:"#ddf4be", icon: "st.Electronics.electronics14", nextState: "1"
            state "Off_Trans", label: "Working", backgroundColor:"#ddf4be", icon: "st.Electronics.electronics14", nextState: "0"
		}

		standardTile("zoneEnabled07_Switch", "zoneEnabled07", width: 2, height: 2, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "Zone 7", action: "setZoneEnabled07_On", backgroundColor: "#ffffff", icon: "st.Electronics.electronics14", nextState: "On_Trans"
			state "1", label: "Zone 7", action: "setZoneEnabled07_Off", backgroundColor: "#79b821", icon: "st.Electronics.electronics14", nextState: "Off_Trans"
            state "On_Trans", label: "Working", backgroundColor:"#ddf4be", icon: "st.Electronics.electronics14", nextState: "1"
            state "Off_Trans", label: "Working", backgroundColor:"#ddf4be", icon: "st.Electronics.electronics14", nextState: "0"
		}

		standardTile("zoneEnabled08_Switch", "zoneEnabled08", width: 2, height: 2, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "Zone 8", action: "setZoneEnabled08_On", backgroundColor: "#ffffff", icon: "st.Electronics.electronics14", nextState: "On_Trans"
			state "1", label: "Zone 8", action: "setZoneEnabled08_Off", backgroundColor: "#79b821", icon: "st.Electronics.electronics14", nextState: "Off_Trans"
            state "On_Trans", label: "Working", backgroundColor:"#ddf4be", icon: "st.Electronics.electronics14", nextState: "1"
            state "Off_Trans", label: "Working", backgroundColor:"#ddf4be", icon: "st.Electronics.electronics14", nextState: "0"
		}

		standardTile("zoneEnabled09_Switch", "zoneEnabled09", width: 2, height: 2, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "Zone 9", action: "setZoneEnabled09_On", backgroundColor: "#ffffff", icon: "st.Electronics.electronics14", nextState: "On_Trans"
			state "1", label: "Zone 9", action: "setZoneEnabled09_Off", backgroundColor: "#79b821", icon: "st.Electronics.electronics14", nextState: "Off_Trans"
            state "On_Trans", label: "Working", backgroundColor:"#ddf4be", icon: "st.Electronics.electronics14", nextState: "1"
            state "Off_Trans", label: "Working", backgroundColor:"#ddf4be", icon: "st.Electronics.electronics14", nextState: "0"
		}

		standardTile("zoneEnabled10_Switch", "zoneEnabled10", width: 2, height: 2, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "Zone 10", action: "setZoneEnabled10_On", backgroundColor: "#ffffff", icon: "st.Electronics.electronics14", nextState: "On_Trans"
			state "1", label: "Zone 10", action: "setZoneEnabled10_Off", backgroundColor: "#79b821", icon: "st.Electronics.electronics14", nextState: "Off_Trans"
            state "On_Trans", label: "Working", backgroundColor:"#ddf4be", icon: "st.Electronics.electronics14", nextState: "1"
            state "Off_Trans", label: "Working", backgroundColor:"#ddf4be", icon: "st.Electronics.electronics14", nextState: "0"
		}
        
		standardTile("zoneSource011_Switch", "zoneSource01", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "1", action: "setZoneSource011", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource011_On_Trans"
			state "1", label: "1", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource011_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "1"
		}
        
		standardTile("zoneSource012_Switch", "zoneSource01", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "2", action: "setZoneSource012", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource012_On_Trans"
			state "2", label: "2", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource012_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "2"
		}
        
		standardTile("zoneSource013_Switch", "zoneSource01", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "3", action: "setZoneSource013", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource013_On_Trans"
			state "3", label: "3", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource013_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "3"
		}
        
		standardTile("zoneSource014_Switch", "zoneSource01", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "4", action: "setZoneSource014", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource014_On_Trans"
			state "4", label: "4", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource014_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "4"
		}
        
		standardTile("zoneSource015_Switch", "zoneSource01", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "5", action: "setZoneSource015", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource015_On_Trans"
			state "5", label: "5", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource015_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "5"
		}
        
		standardTile("zoneSource016_Switch", "zoneSource01", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "6", action: "setZoneSource016", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource016_On_Trans"
			state "6", label: "6", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource016_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "6"
		}
        
		standardTile("zoneSource017_Switch", "zoneSource01", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "7", action: "setZoneSource017", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource017_On_Trans"
			state "7", label: "7", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource017_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "7"
		}
        
		standardTile("zoneSource018_Switch", "zoneSource01", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "8", action: "setZoneSource018", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource018_On_Trans"
			state "8", label: "8", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource018_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "8"
		}

        
		standardTile("zoneSource021_Switch", "zoneSource02", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "1", action: "setZoneSource021", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource021_On_Trans"
			state "1", label: "1", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource021_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "1"
		}
        
		standardTile("zoneSource022_Switch", "zoneSource02", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "2", action: "setZoneSource022", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource022_On_Trans"
			state "2", label: "2", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource022_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "2"
		}
        
		standardTile("zoneSource023_Switch", "zoneSource02", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "3", action: "setZoneSource023", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource023_On_Trans"
			state "3", label: "3", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource023_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "3"
		}
        
		standardTile("zoneSource024_Switch", "zoneSource02", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "4", action: "setZoneSource024", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource024_On_Trans"
			state "4", label: "4", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource024_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "4"
		}
        
		standardTile("zoneSource025_Switch", "zoneSource02", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "5", action: "setZoneSource025", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource025_On_Trans"
			state "5", label: "5", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource025_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "5"
		}
        
		standardTile("zoneSource026_Switch", "zoneSource02", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "6", action: "setZoneSource026", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource026_On_Trans"
			state "6", label: "6", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource026_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "6"
		}
        
		standardTile("zoneSource027_Switch", "zoneSource02", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "7", action: "setZoneSource027", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource027_On_Trans"
			state "7", label: "7", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource027_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "7"
		}
        
		standardTile("zoneSource028_Switch", "zoneSource02", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "8", action: "setZoneSource028", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource028_On_Trans"
			state "8", label: "8", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource028_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "8"
		}


        
		standardTile("zoneSource031_Switch", "zoneSource03", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "1", action: "setZoneSource031", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource031_On_Trans"
			state "1", label: "1", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource031_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "1"
		}
        
		standardTile("zoneSource032_Switch", "zoneSource03", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "2", action: "setZoneSource032", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource032_On_Trans"
			state "2", label: "2", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource032_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "2"
		}
        
		standardTile("zoneSource033_Switch", "zoneSource03", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "3", action: "setZoneSource033", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource033_On_Trans"
			state "3", label: "3", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource033_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "3"
		}
        
		standardTile("zoneSource034_Switch", "zoneSource03", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "4", action: "setZoneSource034", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource034_On_Trans"
			state "4", label: "4", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource034_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "4"
		}
        
		standardTile("zoneSource035_Switch", "zoneSource03", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "5", action: "setZoneSource035", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource035_On_Trans"
			state "5", label: "5", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource035_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "5"
		}
        
		standardTile("zoneSource036_Switch", "zoneSource03", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "6", action: "setZoneSource036", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource036_On_Trans"
			state "6", label: "6", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource036_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "6"
		}
        
		standardTile("zoneSource037_Switch", "zoneSource03", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "7", action: "setZoneSource037", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource037_On_Trans"
			state "7", label: "7", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource037_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "7"
		}
        
		standardTile("zoneSource038_Switch", "zoneSource03", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "8", action: "setZoneSource038", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource038_On_Trans"
			state "8", label: "8", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource038_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "8"
		}

        
		standardTile("zoneSource041_Switch", "zoneSource04", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "1", action: "setZoneSource041", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource041_On_Trans"
			state "1", label: "1", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource041_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "1"
		}
        
		standardTile("zoneSource042_Switch", "zoneSource04", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "2", action: "setZoneSource042", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource042_On_Trans"
			state "2", label: "2", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource042_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "2"
		}
        
		standardTile("zoneSource043_Switch", "zoneSource04", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "3", action: "setZoneSource043", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource043_On_Trans"
			state "3", label: "3", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource043_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "3"
		}
        
		standardTile("zoneSource044_Switch", "zoneSource04", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "4", action: "setZoneSource044", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource044_On_Trans"
			state "4", label: "4", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource044_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "4"
		}
        
		standardTile("zoneSource045_Switch", "zoneSource04", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "5", action: "setZoneSource045", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource045_On_Trans"
			state "5", label: "5", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource045_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "5"
		}
        
		standardTile("zoneSource046_Switch", "zoneSource04", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "6", action: "setZoneSource046", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource046_On_Trans"
			state "6", label: "6", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource046_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "6"
		}
        
		standardTile("zoneSource047_Switch", "zoneSource04", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "7", action: "setZoneSource047", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource047_On_Trans"
			state "7", label: "7", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource047_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "7"
		}
        
		standardTile("zoneSource048_Switch", "zoneSource04", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "8", action: "setZoneSource048", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource048_On_Trans"
			state "8", label: "8", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource048_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "8"
		}

        
		standardTile("zoneSource051_Switch", "zoneSource05", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "1", action: "setZoneSource051", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource051_On_Trans"
			state "1", label: "1", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource051_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "1"
		}
        
		standardTile("zoneSource052_Switch", "zoneSource05", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "2", action: "setZoneSource052", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource052_On_Trans"
			state "2", label: "2", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource052_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "2"
		}
        
		standardTile("zoneSource053_Switch", "zoneSource05", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "3", action: "setZoneSource053", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource053_On_Trans"
			state "3", label: "3", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource053_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "3"
		}
        
		standardTile("zoneSource054_Switch", "zoneSource05", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "4", action: "setZoneSource054", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource054_On_Trans"
			state "4", label: "4", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource054_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "4"
		}
        
		standardTile("zoneSource055_Switch", "zoneSource05", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "5", action: "setZoneSource055", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource055_On_Trans"
			state "5", label: "5", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource055_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "5"
		}
        
		standardTile("zoneSource056_Switch", "zoneSource05", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "6", action: "setZoneSource056", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource056_On_Trans"
			state "6", label: "6", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource056_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "6"
		}
        
		standardTile("zoneSource057_Switch", "zoneSource05", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "7", action: "setZoneSource057", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource057_On_Trans"
			state "7", label: "7", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource057_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "7"
		}
        
		standardTile("zoneSource058_Switch", "zoneSource05", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "8", action: "setZoneSource058", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource058_On_Trans"
			state "8", label: "8", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource058_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "8"
		}

        
		standardTile("zoneSource061_Switch", "zoneSource06", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "1", action: "setZoneSource061", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource061_On_Trans"
			state "1", label: "1", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource061_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "1"
		}
        
		standardTile("zoneSource062_Switch", "zoneSource06", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "2", action: "setZoneSource062", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource062_On_Trans"
			state "2", label: "2", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource062_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "2"
		}
        
		standardTile("zoneSource063_Switch", "zoneSource06", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "3", action: "setZoneSource063", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource063_On_Trans"
			state "3", label: "3", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource063_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "3"
		}
        
		standardTile("zoneSource064_Switch", "zoneSource06", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "4", action: "setZoneSource064", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource064_On_Trans"
			state "4", label: "4", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource064_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "4"
		}
        
		standardTile("zoneSource065_Switch", "zoneSource06", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "5", action: "setZoneSource065", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource065_On_Trans"
			state "5", label: "5", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource065_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "5"
		}
        
		standardTile("zoneSource066_Switch", "zoneSource06", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "6", action: "setZoneSource066", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource066_On_Trans"
			state "6", label: "6", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource066_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "6"
		}
        
		standardTile("zoneSource067_Switch", "zoneSource06", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "7", action: "setZoneSource067", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource067_On_Trans"
			state "7", label: "7", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource067_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "7"
		}
        
		standardTile("zoneSource068_Switch", "zoneSource06", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "8", action: "setZoneSource068", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource068_On_Trans"
			state "8", label: "8", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource068_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "8"
		}

        
		standardTile("zoneSource071_Switch", "zoneSource07", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "1", action: "setZoneSource071", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource071_On_Trans"
			state "1", label: "1", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource071_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "1"
		}
        
		standardTile("zoneSource072_Switch", "zoneSource07", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "2", action: "setZoneSource072", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource072_On_Trans"
			state "2", label: "2", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource072_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "2"
		}
        
		standardTile("zoneSource073_Switch", "zoneSource07", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "3", action: "setZoneSource073", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource073_On_Trans"
			state "3", label: "3", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource073_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "3"
		}
        
		standardTile("zoneSource074_Switch", "zoneSource07", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "4", action: "setZoneSource074", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource074_On_Trans"
			state "4", label: "4", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource074_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "4"
		}
        
		standardTile("zoneSource075_Switch", "zoneSource07", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "5", action: "setZoneSource075", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource075_On_Trans"
			state "5", label: "5", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource075_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "5"
		}
        
		standardTile("zoneSource076_Switch", "zoneSource07", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "6", action: "setZoneSource076", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource076_On_Trans"
			state "6", label: "6", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource076_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "6"
		}
        
		standardTile("zoneSource077_Switch", "zoneSource07", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "7", action: "setZoneSource077", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource077_On_Trans"
			state "7", label: "7", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource077_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "7"
		}
        
		standardTile("zoneSource078_Switch", "zoneSource07", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "8", action: "setZoneSource078", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource078_On_Trans"
			state "8", label: "8", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource078_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "8"
		}

        
		standardTile("zoneSource081_Switch", "zoneSource08", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "1", action: "setZoneSource081", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource081_On_Trans"
			state "1", label: "1", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource081_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "1"
		}
        
		standardTile("zoneSource082_Switch", "zoneSource08", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "2", action: "setZoneSource082", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource082_On_Trans"
			state "2", label: "2", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource082_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "2"
		}
        
		standardTile("zoneSource083_Switch", "zoneSource08", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "3", action: "setZoneSource083", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource083_On_Trans"
			state "3", label: "3", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource083_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "3"
		}
        
		standardTile("zoneSource084_Switch", "zoneSource08", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "4", action: "setZoneSource084", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource084_On_Trans"
			state "4", label: "4", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource084_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "4"
		}
        
		standardTile("zoneSource085_Switch", "zoneSource08", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "5", action: "setZoneSource085", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource085_On_Trans"
			state "5", label: "5", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource085_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "5"
		}
        
		standardTile("zoneSource086_Switch", "zoneSource08", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "6", action: "setZoneSource086", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource086_On_Trans"
			state "6", label: "6", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource086_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "6"
		}
        
		standardTile("zoneSource087_Switch", "zoneSource08", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "7", action: "setZoneSource087", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource087_On_Trans"
			state "7", label: "7", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource087_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "7"
		}
        
		standardTile("zoneSource088_Switch", "zoneSource08", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "8", action: "setZoneSource088", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource088_On_Trans"
			state "8", label: "8", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource088_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "8"
		}

        
		standardTile("zoneSource091_Switch", "zoneSource09", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "1", action: "setZoneSource091", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource091_On_Trans"
			state "1", label: "1", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource091_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "1"
		}
        
		standardTile("zoneSource092_Switch", "zoneSource09", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "2", action: "setZoneSource092", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource092_On_Trans"
			state "2", label: "2", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource092_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "2"
		}
        
		standardTile("zoneSource093_Switch", "zoneSource09", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "3", action: "setZoneSource093", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource093_On_Trans"
			state "3", label: "3", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource093_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "3"
		}
        
		standardTile("zoneSource094_Switch", "zoneSource09", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "4", action: "setZoneSource094", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource094_On_Trans"
			state "4", label: "4", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource094_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "4"
		}
        
		standardTile("zoneSource095_Switch", "zoneSource09", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "5", action: "setZoneSource095", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource095_On_Trans"
			state "5", label: "5", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource095_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "5"
		}
        
		standardTile("zoneSource096_Switch", "zoneSource09", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "6", action: "setZoneSource096", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource096_On_Trans"
			state "6", label: "6", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource096_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "6"
		}
        
		standardTile("zoneSource097_Switch", "zoneSource09", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "7", action: "setZoneSource097", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource097_On_Trans"
			state "7", label: "7", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource097_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "7"
		}
        
		standardTile("zoneSource098_Switch", "zoneSource09", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "8", action: "setZoneSource098", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource098_On_Trans"
			state "8", label: "8", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource098_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "8"
		}

        
		standardTile("zoneSource101_Switch", "zoneSource10", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "1", action: "setZoneSource101", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource101_On_Trans"
			state "1", label: "1", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource101_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "1"
		}
        
		standardTile("zoneSource102_Switch", "zoneSource10", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "2", action: "setZoneSource102", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource102_On_Trans"
			state "2", label: "2", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource102_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "2"
		}
        
		standardTile("zoneSource103_Switch", "zoneSource10", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "3", action: "setZoneSource103", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource103_On_Trans"
			state "3", label: "3", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource103_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "3"
		}
        
		standardTile("zoneSource104_Switch", "zoneSource10", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "4", action: "setZoneSource104", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource104_On_Trans"
			state "4", label: "4", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource104_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "4"
		}
        
		standardTile("zoneSource105_Switch", "zoneSource10", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "5", action: "setZoneSource105", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource105_On_Trans"
			state "5", label: "5", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource105_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "5"
		}
        
		standardTile("zoneSource106_Switch", "zoneSource10", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "6", action: "setZoneSource106", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource106_On_Trans"
			state "6", label: "6", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource106_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "6"
		}
        
		standardTile("zoneSource107_Switch", "zoneSource10", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "7", action: "setZoneSource107", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource107_On_Trans"
			state "7", label: "7", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource107_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "7"
		}
        
		standardTile("zoneSource108_Switch", "zoneSource10", width: 1, height: 1, canChangeIcon: true, canChangeBackground: true, decoration: "flat") {
			state "0", label: "8", action: "setZoneSource108", icon: "st.Electronics.electronics6", backgroundColor: "#ffffff", defaultState: true, nextState: "zoneSource108_On_Trans"
			state "8", label: "8", icon: "st.Electronics.electronics6", backgroundColor: "#79b821"
            state "zoneSource108_On_Trans", label: "Working", backgroundColor:"#ddf4be", nextState: "8"
		}
        controlTile("zoneLevel01_Slider", "zoneLevel01", "slider", height: 2, width: 6, range:"(1..10)") {
		    state "zoneLevel01", action:"setZoneLevel01"
		}
        

        controlTile("zoneLevel02_Slider", "zoneLevel02", "slider", height: 2, width: 6, range:"(1..10)") {
		    state "zoneLevel02", action:"setZoneLevel02"
		}

        controlTile("zoneLevel03_Slider", "zoneLevel03", "slider", height: 2, width: 6, range:"(1..10)") {
		    state "zoneLevel03", action:"setZoneLevel03"
		}

        controlTile("zoneLevel04_Slider", "zoneLevel04", "slider", height: 2, width: 6, range:"(1..10)") {
		    state "zoneLevel04", action:"setZoneLevel04"
		}

        controlTile("zoneLevel05_Slider", "zoneLevel05", "slider", height: 2, width: 6, range:"(1..10)") {
		    state "zoneLevel05", action:"setZoneLevel05"
		}

        controlTile("zoneLevel06_Slider", "zoneLevel06", "slider", height: 2, width: 6, range:"(1..10)") {
		    state "zoneLevel06", action:"setZoneLevel06"
		}

        controlTile("zoneLevel07_Slider", "zoneLevel07", "slider", height: 2, width: 6, range:"(1..10)") {
		    state "zoneLevel07", action:"setZoneLevel07"
		}

        controlTile("zoneLevel08_Slider", "zoneLevel08", "slider", height: 2, width: 6, range:"(1..10)") {
		    state "zoneLevel08", action:"setZoneLevel08"
		}

        controlTile("zoneLevel09_Slider", "zoneLevel09", "slider", height: 2, width: 6, range:"(1..10)") {
		    state "zoneLevel09", action:"setZoneLevel09"
		}

        controlTile("zoneLevel10_Slider", "zoneLevel10", "slider", height: 2, width: 6, range:"(1..10)") {
		    state "zoneLevel10", action:"setZoneLevel10"
		}

		main "message"
		details([
        	"zoneEnabled01_Switch", 
        	"zoneSource011_Switch", 
            "zoneSource012_Switch",
            "zoneSource013_Switch", 
            "zoneSource014_Switch", 
            "zoneSource015_Switch", 
            "zoneSource016_Switch", 
            "zoneSource017_Switch", 
            "zoneSource018_Switch",
            "zoneLevel01_Slider",
        	"zoneEnabled02_Switch", 
        	"zoneSource021_Switch", 
            "zoneSource022_Switch",
            "zoneSource023_Switch", 
            "zoneSource024_Switch", 
            "zoneSource025_Switch", 
            "zoneSource026_Switch", 
            "zoneSource027_Switch", 
            "zoneSource028_Switch",
            "zoneLevel02_Slider",
        	"zoneEnabled03_Switch", 
        	"zoneSource031_Switch", 
            "zoneSource032_Switch",
            "zoneSource033_Switch", 
            "zoneSource034_Switch", 
            "zoneSource035_Switch", 
            "zoneSource036_Switch", 
            "zoneSource037_Switch", 
            "zoneSource038_Switch",
            "zoneLevel03_Slider",
        	"zoneEnabled04_Switch", 
        	"zoneSource041_Switch", 
            "zoneSource042_Switch",
            "zoneSource043_Switch", 
            "zoneSource044_Switch", 
            "zoneSource045_Switch", 
            "zoneSource046_Switch", 
            "zoneSource047_Switch", 
            "zoneSource048_Switch",
            "zoneLevel04_Slider",
        	"zoneEnabled05_Switch", 
        	"zoneSource051_Switch", 
            "zoneSource052_Switch",
            "zoneSource053_Switch", 
            "zoneSource054_Switch", 
            "zoneSource055_Switch", 
            "zoneSource056_Switch", 
            "zoneSource057_Switch", 
            "zoneSource058_Switch",
            "zoneLevel05_Slider",
        	"zoneEnabled06_Switch", 
        	"zoneSource061_Switch", 
            "zoneSource062_Switch",
            "zoneSource063_Switch", 
            "zoneSource064_Switch", 
            "zoneSource065_Switch", 
            "zoneSource066_Switch", 
            "zoneSource067_Switch", 
            "zoneSource068_Switch",
            "zoneLevel06_Slider",
        	"zoneEnabled07_Switch", 
        	"zoneSource071_Switch", 
            "zoneSource072_Switch",
            "zoneSource073_Switch", 
            "zoneSource074_Switch", 
            "zoneSource075_Switch", 
            "zoneSource076_Switch", 
            "zoneSource077_Switch", 
            "zoneSource078_Switch",
            "zoneLevel07_Slider",
        	"zoneEnabled08_Switch", 
        	"zoneSource081_Switch", 
            "zoneSource082_Switch",
            "zoneSource083_Switch", 
            "zoneSource084_Switch", 
            "zoneSource085_Switch", 
            "zoneSource086_Switch", 
            "zoneSource087_Switch", 
            "zoneSource088_Switch",
            "zoneLevel08_Slider",
        	"zoneEnabled09_Switch", 
        	"zoneSource091_Switch", 
            "zoneSource092_Switch",
            "zoneSource093_Switch", 
            "zoneSource094_Switch", 
            "zoneSource095_Switch", 
            "zoneSource096_Switch", 
            "zoneSource097_Switch", 
            "zoneSource098_Switch",
            "zoneLevel09_Slider",
        	"zoneEnabled10_Switch", 
        	"zoneSource101_Switch", 
            "zoneSource102_Switch",
            "zoneSource103_Switch", 
            "zoneSource104_Switch", 
            "zoneSource105_Switch", 
            "zoneSource106_Switch", 
            "zoneSource107_Switch", 
            "zoneSource108_Switch",
            "zoneLevel10_Slider"
            ])
	}
}

def sendToSmartShield(String s) {
	//log.debug "Sending to shield:'${s}'"
    zigbee.smartShield(text: "${s}").format()
	//log.debug "Sent to shield:'${s}'"
}

def setZoneEnabled01_On() {
	zigbee.smartShield(text: "zoneEnabled011").format()
}

def setZoneEnabled02_On() {
	zigbee.smartShield(text: "zoneEnabled021").format()
}

def setZoneEnabled03_On() {
	zigbee.smartShield(text: "zoneEnabled031").format()
}

def setZoneEnabled04_On() {
	zigbee.smartShield(text: "zoneEnabled041").format()
}

def setZoneEnabled05_On() {
	zigbee.smartShield(text: "zoneEnabled051").format()
}

def setZoneEnabled06_On() {
	zigbee.smartShield(text: "zoneEnabled061").format()
}

def setZoneEnabled07_On() {
	zigbee.smartShield(text: "zoneEnabled071").format()
}

def setZoneEnabled08_On() {
	zigbee.smartShield(text: "zoneEnabled081").format()
}

def setZoneEnabled09_On() {
	zigbee.smartShield(text: "zoneEnabled091").format()
}

def setZoneEnabled10_On() {
	zigbee.smartShield(text: "zoneEnabled101").format()
}

def setZoneEnabled01_Off() {
	zigbee.smartShield(text: "zoneEnabled010").format()
}

def setZoneEnabled02_Off() {
	zigbee.smartShield(text: "zoneEnabled020").format()
}

def setZoneEnabled03_Off() {
	zigbee.smartShield(text: "zoneEnabled030").format()
}

def setZoneEnabled04_Off() {
	zigbee.smartShield(text: "zoneEnabled040").format()
}

def setZoneEnabled05_Off() {
	zigbee.smartShield(text: "zoneEnabled050").format()
}

def setZoneEnabled06_Off() {
	zigbee.smartShield(text: "zoneEnabled060").format()
}

def setZoneEnabled07_Off() {
	zigbee.smartShield(text: "zoneEnabled070").format()
}

def setZoneEnabled08_Off() {
	zigbee.smartShield(text: "zoneEnabled080").format()
}

def setZoneEnabled09_Off() {
	zigbee.smartShield(text: "zoneEnabled090").format()
}

def setZoneEnabled10_Off() {
	zigbee.smartShield(text: "zoneEnabled100").format()
}

def setZoneLevel(String zone, int level){
	String sLevel= String.format("%02d", level)
    //log.debug "zoneLevel${zone}${sLevel}"
	zigbee.smartShield(text: "zoneLevel${zone}${sLevel}").format()
}

def setZoneLevel01(int level) {
	setZoneLevel("01", level)
}

def setZoneLevel02(int level) {
	setZoneLevel("02", level)
}

def setZoneLevel03(int level) {
	setZoneLevel("03", level)
}

def setZoneLevel04(int level) {
	setZoneLevel("04", level)
}

def setZoneLevel05(int level) {
	setZoneLevel("05", level)
}

def setZoneLevel06(int level) {
	setZoneLevel("06", level)
}

def setZoneLevel07(int level) {
	setZoneLevel("07", level)
}

def setZoneLevel08(int level) {
	setZoneLevel("08", level)
}

def setZoneLevel09(int level) {
	setZoneLevel("09", level)
}

def setZoneLevel10(int level) {
	setZoneLevel("10", level)
}

def setZoneSource(String zone, String source){
	zigbee.smartShield(text: "zoneSource${zone}${source}").format()
}

def setZoneSource011(){
	setZoneSource("01", "1")
}

def setZoneSource012(){
	setZoneSource("01", "2")
}

def setZoneSource013(){
	setZoneSource("01", "3")
}

def setZoneSource014(){
	setZoneSource("01", "4")
}

def setZoneSource015(){
	setZoneSource("01", "5")
}

def setZoneSource016(){
	setZoneSource("01", "6")
}

def setZoneSource017(){
	setZoneSource("01", "7")
}

def setZoneSource018(){
	setZoneSource("01", "8")
}

def setZoneSource021(){
	setZoneSource("02", "1")
}

def setZoneSource022(){
	setZoneSource("02", "2")
}

def setZoneSource023(){
	setZoneSource("02", "3")
}

def setZoneSource024(){
	setZoneSource("02", "4")
}

def setZoneSource025(){
	setZoneSource("02", "5")
}

def setZoneSource026(){
	setZoneSource("02", "6")
}

def setZoneSource027(){
	setZoneSource("02", "7")
}

def setZoneSource028(){
	setZoneSource("02", "8")
}

def setZoneSource031(){
	setZoneSource("03", "1")
}

def setZoneSource032(){
	setZoneSource("03", "2")
}

def setZoneSource033(){
	setZoneSource("03", "3")
}

def setZoneSource034(){
	setZoneSource("03", "4")
}

def setZoneSource035(){
	setZoneSource("03", "5")
}

def setZoneSource036(){
	setZoneSource("03", "6")
}

def setZoneSource037(){
	setZoneSource("03", "7")
}

def setZoneSource038(){
	setZoneSource("03", "8")
}

def setZoneSource041(){
	setZoneSource("04", "1")
}

def setZoneSource042(){
	setZoneSource("04", "2")
}

def setZoneSource043(){
	setZoneSource("04", "3")
}

def setZoneSource044(){
	setZoneSource("04", "4")
}

def setZoneSource045(){
	setZoneSource("04", "5")
}

def setZoneSource046(){
	setZoneSource("04", "6")
}

def setZoneSource047(){
	setZoneSource("04", "7")
}

def setZoneSource048(){
	setZoneSource("04", "8")
}

def setZoneSource051(){
	setZoneSource("05", "1")
}

def setZoneSource052(){
	setZoneSource("05", "2")
}

def setZoneSource053(){
	setZoneSource("05", "3")
}

def setZoneSource054(){
	setZoneSource("05", "4")
}

def setZoneSource055(){
	setZoneSource("05", "5")
}

def setZoneSource056(){
	setZoneSource("05", "6")
}

def setZoneSource057(){
	setZoneSource("05", "7")
}

def setZoneSource058(){
	setZoneSource("05", "8")
}


def setZoneSource061(){
	setZoneSource("06", "1")
}

def setZoneSource062(){
	setZoneSource("06", "2")
}

def setZoneSource063(){
	setZoneSource("06", "3")
}

def setZoneSource064(){
	setZoneSource("06", "4")
}

def setZoneSource065(){
	setZoneSource("06", "5")
}

def setZoneSource066(){
	setZoneSource("06", "6")
}

def setZoneSource067(){
	setZoneSource("06", "7")
}

def setZoneSource068(){
	setZoneSource("06", "8")
}

def setZoneSource071(){
	setZoneSource("07", "1")
}

def setZoneSource072(){
	setZoneSource("07", "2")
}

def setZoneSource073(){
	setZoneSource("07", "3")
}

def setZoneSource074(){
	setZoneSource("07", "4")
}

def setZoneSource075(){
	setZoneSource("07", "5")
}

def setZoneSource076(){
	setZoneSource("07", "6")
}

def setZoneSource077(){
	setZoneSource("07", "7")
}

def setZoneSource078(){
	setZoneSource("07", "8")
}

def setZoneSource081(){
	setZoneSource("08", "1")
}

def setZoneSource082(){
	setZoneSource("08", "2")
}

def setZoneSource083(){
	setZoneSource("08", "3")
}

def setZoneSource084(){
	setZoneSource("08", "4")
}

def setZoneSource085(){
	setZoneSource("08", "5")
}

def setZoneSource086(){
	setZoneSource("08", "6")
}

def setZoneSource087(){
	setZoneSource("08", "7")
}

def setZoneSource088(){
	setZoneSource("08", "8")
}

def setZoneSource091(){
	setZoneSource("09", "1")
}

def setZoneSource092(){
	setZoneSource("09", "2")
}

def setZoneSource093(){
	setZoneSource("09", "3")
}

def setZoneSource094(){
	setZoneSource("09", "4")
}

def setZoneSource095(){
	setZoneSource("09", "5")
}

def setZoneSource096(){
	setZoneSource("09", "6")
}

def setZoneSource097(){
	setZoneSource("09", "7")
}

def setZoneSource098(){
	setZoneSource("09", "8")
}

def setZoneSource101(){
	setZoneSource("10", "1")
}

def setZoneSource102(){
	setZoneSource("10", "2")
}

def setZoneSource103(){
	setZoneSource("10", "3")
}

def setZoneSource104(){
	setZoneSource("10", "4")
}

def setZoneSource105(){
	setZoneSource("10", "5")
}

def setZoneSource106(){
	setZoneSource("10", "6")
}

def setZoneSource107(){
	setZoneSource("10", "7")
}

def setZoneSource108(){
	setZoneSource("10", "8")
}

def parse(String description) {
    def events = []
    
    def value = zigbee.parse(description)?.text
    log.debug value
	//if(value){    
    //	events << createEvent(name:"greeting", value:value)
    //}
    
    if(value?.startsWith("zoneLevel")){    
    	def zone = value.substring(9,11)
        def level = value.substring(11,13)
        log.debug "createEvent zoneLevel${zone} value:${level}"
    	events << createEvent(name:"zoneLevel${zone}", value:level)
    }
    else if(value?.startsWith("zoneEnabled")){
    	def zone = value.substring(11,13)
        def enabled = value.substring(13,14)
        log.debug "createEvent zoneEnabled${zone} value:${enabled}"
    	events << createEvent(name:"zoneEnabled${zone}", value: enabled)
        //events << createEvent(name:"zoneEnabled${zone}", value: enabled == "0" ? "zoneEnabled${zone}_Off" : "zoneEnabled${zone}_On")
    }
    else if(value?.startsWith("zoneSource")){
    	def zone = value.substring(10,12)
        def source = value.substring(12,13)
        log.debug "createEvent zoneSource${zone} value:${source}"
    	events << createEvent(name:"zoneSource${zone}", value:source)
    }
	return events
}

def installed() {
    //sendEvent(name: "switch", value: "on")
    //sendEvent(name: "integerFloat", value: 47.0)
    //sendEvent(name: "pi", value: 3.14159)
    //sendEvent(name: "floatAsText", value: "3.14159")
}

