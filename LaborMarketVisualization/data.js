 var array = [ ['Lat', 'Long', 'Name', 'employment Rate'],  [ 32.449,-99.733,'Abilene, TX',3.8 ],  [ 41.081,-81.519,'Akron, OH',6.2 ],  [ 31.579,-84.156,'Albany, GA',6.3 ],  [ 44.637,-123.106,'Albany, OR',7.9 ],  [ 42.653,-73.756,'Albany Schenectady Troy, NY',5 ],  [ 35.111,-106.61,'Albuquerque, NM',4.6 ],  [ 31.311,-92.445,'Alexandria, LA',4.7 ],  [ 40.519,-78.395,'Altoona, PA',5.2 ],  [ 35.222,-101.831,'Amarillo, TX',3.5 ],  [ 42.035,-93.62,'Ames, IA',3.2 ],  [ 61.218,-149.9,'Anchorage, AK',5.9 ],  [ 42.281,-83.743,'Ann Arbor, MI',5.7 ],  [ 33.66,-85.832,'Anniston Oxford Jacksonville, AL',5.7 ],  [ 44.262,-88.415,'Appleton, WI',4.6 ],  [ 35.595,-82.551,'Asheville, NC',4.8 ],  [ 33.95,-83.383,'Athens Clarke County, GA',5 ],  [ 33.749,-84.388,'Atlanta Sandy Springs Roswell, GA',6.2 ],  [ 39.364,-74.423,'Atlantic City Hammonton, NJ',6.8 ],  [ 32.61,-85.481,'Auburn Opelika, AL',5.2 ],  [ 30.267,-97.743,'Austin Round Rock, TX',4.3 ],  [ 35.373,-119.019,'Bakersfield, CA',9.9 ],  [ 39.29,-76.612,'Baltimore Columbia Towson, MD',4.5 ],  [ 44.801,-68.778,'Bangor, ME',5.4 ],  [ 41.7,-70.3,'Barnstable Town, MA',5.9 ],  [ 30.458,-91.14,'Baton Rouge, LA',4.8 ],  [ 42.321,-85.18,'Battle Creek, MI',7.4 ],  [ 43.594,-83.889,'Bay City, MI',7.6 ],  [ 30.08,-94.127,'Beaumont Port Arthur, TX',6.4 ],  [ 37.778,-81.188,'Beckley, WV',4.2 ],  [ 48.749,-122.478,'Bellingham, WA',5.3 ],  [ 44.058,-121.315,'Bend Redmond, OR',8.3 ],  [ 45.783,-108.501,'Billings, MT',3.8 ],  [ 42.099,-75.918,'Binghamton, NY',5.5 ],  [ 33.521,-86.802,'Birmingham Hoover, AL',5 ],  [ 46.808,-100.784,'Bismarck, ND',3.1 ],  [ 37.23,-80.414,'Blacksburg Christiansburg Radford, VA',4.8 ],  [ 40.484,-88.994,'Bloomington, IL',5 ],  [ 39.165,-86.526,'Bloomington, IN',4.8 ],  [ 41.004,-76.455,'Bloomsburg Berwick, PA',5.7 ],  [ 43.619,-116.215,'Boise City, ID',5.4 ],  [ 40.015,-105.271,'Boulder, CO',4.2 ],  [ 36.969,-86.481,'Bowling Green, KY',5.9 ],  [ 47.567,-122.633,'Bremerton Silverdale, WA',5.3 ],  [ 41.187,-73.195,'Bridgeport Stamford Norwalk, CT',5.3 ],  [ 25.902,-97.497,'Brownsville Harlingen, TX',6.6 ],  [ 31.15,-81.491,'Brunswick, GA',5.4 ],  [ 42.886,-78.878,'Buffalo Cheektowaga Niagara Falls, NY',5.9 ],  [ 36.096,-79.438,'Burlington, NC',6.4 ],  [ 44.476,-73.212,'Burlington South Burlington, VT',4.2 ],  [ 38.3,-76.507,'California Lexington Park, MD',3.6 ],  [ 40.799,-81.378,'Canton Massillon, OH',6.8 ],  [ 26.563,-81.95,'Cape Coral Fort Myers, FL',8.4 ],  [ 37.727,-89.217,'Carbondale Marion, IL',6.3 ],  [ 39.164,-119.767,'Carson City, NV',7.1 ],  [ 42.867,-106.313,'Casper, WY',2.8 ],  [ 41.978,-91.666,'Cedar Rapids, IA',4.1 ],  [ 39.938,-77.661,'Chambersburg Waynesboro, PA',4.4 ],  [ 40.116,-88.243,'Champaign Urbana, IL',5.5 ],  [ 38.35,-81.633,'Charleston, WV',3.6 ],  [ 32.776,-79.931,'Charleston North Charleston, SC',5.6 ],  [ 38.029,-78.477,'Charlottesville, VA',3.4 ],  [ 41.14,-104.82,'Cheyenne, WY',3.9 ],  [ 39.728,-121.837,'Chico, CA',8.5 ],  [ 35.16,-84.877,'Cleveland, TN',6.6 ],  [ 41.499,-81.694,'Cleveland Elyria, OH',6 ],  [ 47.678,-116.78,'Coeur d Alene, ID',5.8 ],  [ 30.628,-96.334,'College Station Bryan, TX',4 ],  [ 38.834,-104.821,'Colorado Springs, CO',5.7 ],  [ 38.952,-92.334,'Columbia, MO',4.4 ],  [ 34.001,-81.035,'Columbia, SC',5.9 ],  [ 39.201,-85.921,'Columbus, IN',4.7 ],  [ 39.961,-82.999,'Columbus, OH',5.7 ],  [ 27.801,-97.396,'Corpus Christi, TX',4.6 ],  [ 44.565,-123.262,'Corvallis, OR',4.7 ],  [ 30.754,-86.573,'Crestview Fort Walton Beach Destin, FL',4.7 ],  [ 32.78,-96.8,'Dallas Fort Worth Arlington, TX',4.9 ],  [ 34.77,-84.97,'Dalton, GA',7.5 ],  [ 40.124,-87.63,'Danville, IL',7.7 ],  [ 30.604,-87.904,'Daphne Fairhope Foley, AL',4.6 ],  [ 39.759,-84.192,'Dayton, OH',7.1 ],  [ 34.606,-86.983,'Decatur, AL',5.4 ],  [ 39.84,-88.955,'Decatur, IL',6.8 ],  [ 28.901,-81.264,'Deltona Daytona Beach Ormond Beach, FL',7.1 ],  [ 39.738,-104.985,'Denver Aurora Lakewood, CO',4.9 ],  [ 41.601,-93.609,'Des Moines West Des Moines, IA',4 ],  [ 42.331,-83.046,'Detroit Warren Dearborn, MI',8.3 ],  [ 31.223,-85.39,'Dothan, AL',5.3 ],  [ 39.158,-75.524,'Dover, DE',4.9 ],  [ 42.501,-90.665,'Dubuque, IA',4.4 ],  [ 35.994,-78.899,'Durham Chapel Hill, NC',4.7 ],  [ 41,-75.181,'East Stroudsburg, PA',6 ],  [ 44.811,-91.498,'Eau Claire, WI',4.6 ],  [ 32.792,-115.563,'El Centro, CA',22.5 ],  [ 31.778,-106.442,'El Paso, TX',6.1 ],  [ 37.703,-85.865,'Elizabethtown Fort Knox, KY',6.5 ],  [ 41.682,-85.977,'Elkhart Goshen, IN',8.6 ],  [ 42.09,-76.808,'Elmira, NY',5.6 ],  [ 42.129,-80.085,'Erie, PA',5.6 ],  [ 44.052,-123.087,'Eugene, OR',6.7 ],  [ 64.838,-147.716,'Fairbanks, AK',6.1 ],  [ 36.728,-108.219,'Farmington, NM',3.9 ],  [ 35.053,-78.878,'Fayetteville, NC',6.1 ],  [ 35.198,-111.651,'Flagstaff, AZ',5.6 ],  [ 43.013,-83.687,'Flint, MI',10.2 ],  [ 34.195,-79.763,'Florence, SC',7.5 ],  [ 34.8,-87.677,'Florence Muscle Shoals, AL',6 ],  [ 43.773,-88.447,'Fond du Lac, WI',4.8 ],  [ 40.585,-105.084,'Fort Collins, CO',4.2 ],  [ 41.079,-85.139,'Fort Wayne, IN',6 ],  [ 36.747,-119.773,'Fresno, CA',10.6 ],  [ 34.014,-86.007,'Gadsden, AL',6 ],  [ 29.652,-82.325,'Gainesville, FL',4.5 ],  [ 34.298,-83.824,'Gainesville, GA',5.4 ],  [ 39.831,-77.231,'Gettysburg, PA',4.3 ],  [ 42.255,-74.027,'Glens Falls, NY',5.5 ],  [ 35.385,-77.993,'Goldsboro, NC',5.8 ],  [ 40.926,-98.342,'Grand Island, NE',2.9 ],  [ 39.064,-108.551,'Grand Junction, CO',3.9 ],  [ 42.963,-85.668,'Grand Rapids Wyoming, MI',6.9 ],  [ 42.439,-123.328,'Grants Pass, OR',9.2 ],  [ 47.494,-111.283,'Great Falls, MT',4.7 ],  [ 40.423,-104.709,'Greeley, CO',5.2 ],  [ 44.519,-88.02,'Green Bay, WI',4.8 ],  [ 36.073,-79.792,'Greensboro High Point, NC',6.2 ],  [ 35.613,-77.366,'Greenville, NC',6.4 ],  [ 34.853,-82.394,'Greenville Anderson Mauldin, SC',6 ],  [ 30.367,-89.093,'Gulfport Biloxi Pascagoula, MS',5.5 ],  [ 30.504,-90.461,'Hammond, LA',5.7 ],  [ 36.327,-119.646,'Hanford Corcoran, CA',10.6 ],  [ 40.273,-76.887,'Harrisburg Carlisle, PA',4.5 ],  [ 38.45,-78.869,'Harrisonburg, VA',3.6 ],  [ 41.764,-72.685,'Hartford West Hartford East Hartford, CT',5.8 ],  [ 31.327,-89.29,'Hattiesburg, MS',5.4 ],  [ 35.734,-81.344,'Hickory Lenoir Morganton, NC',7.5 ],  [ 32.216,-80.753,'Hilton Head Island Bluffton Beaufort, SC',5.4 ],  [ 31.847,-81.596,'Hinesville, GA',5.7 ],  [ 28.804,-82.576,'Homosassa Springs, FL',8.4 ],  [ 34.504,-93.055,'Hot Springs, AR',5.7 ],  [ 29.596,-90.72,'Houma Thibodaux, LA',3.4 ],  [ 29.76,-95.369,'Houston The Woodlands Sugar Land, TX',4.7 ],  [ 34.73,-86.586,'Huntsville, AL',4.3 ],  [ 43.492,-112.034,'Idaho Falls, ID',3.7 ],  [ 39.768,-86.158,'Indianapolis Carmel Anderson, IN',5.2 ],  [ 41.661,-91.53,'Iowa City, IA',3.2 ],  [ 42.444,-76.502,'Ithaca, NY',4.1 ],  [ 42.246,-84.401,'Jackson, MI',8.3 ],  [ 32.299,-90.185,'Jackson, MS',5.4 ],  [ 35.615,-88.814,'Jackson, TN',7 ],  [ 30.332,-81.656,'Jacksonville, FL',6 ],  [ 34.754,-77.43,'Jacksonville, NC',5.6 ],  [ 42.683,-89.019,'Janesville Beloit, WI',6.3 ],  [ 38.577,-92.174,'Jefferson City, MO',5 ],  [ 36.313,-82.353,'Johnson City, TN',6.1 ],  [ 40.327,-78.922,'Johnstown, PA',6.1 ],  [ 35.842,-90.704,'Jonesboro, AR',5.2 ],  [ 37.084,-94.513,'Joplin, MO',5.4 ],  [ 20.889,-156.473,'Kahului Wailuku Lahaina, HI',4.9 ],  [ 42.292,-85.587,'Kalamazoo Portage, MI',6.6 ],  [ 41.12,-87.861,'Kankakee, IL',8.3 ],  [ 46.211,-119.137,'Kennewick Richland, WA',5.8 ],  [ 31.117,-97.728,'Killeen Temple, TX',5 ],  [ 41.927,-73.997,'Kingston, NY',5.5 ],  [ 35.961,-83.921,'Knoxville, TN',5.6 ],  [ 40.486,-86.134,'Kokomo, IN',7.8 ],  [ 30.224,-92.02,'Lafayette, LA',3.8 ],  [ 40.417,-86.875,'Lafayette West Lafayette, IN',4.9 ],  [ 30.227,-93.217,'Lake Charles, LA',4.5 ],  [ 34.484,-114.322,'Lake Havasu City Kingman, AZ',7.7 ],  [ 28.039,-81.95,'Lakeland Winter Haven, FL',6.9 ],  [ 40.038,-76.306,'Lancaster, PA',4.3 ],  [ 42.733,-84.556,'Lansing East Lansing, MI',6.6 ],  [ 27.531,-99.48,'Laredo, TX',5.3 ],  [ 32.32,-106.764,'Las Cruces, NM',4.8 ],  [ 36.17,-115.14,'Las Vegas Henderson Paradise, NV',6.6 ],  [ 38.972,-95.235,'Lawrence, KS',4.2 ],  [ 34.604,-98.396,'Lawton, OK',3.7 ],  [ 40.341,-76.411,'Lebanon, PA',4.2 ],  [ 44.1,-70.215,'Lewiston Auburn, ME',5.6 ],  [ 38.041,-84.504,'Lexington Fayette, KY',5.1 ],  [ 40.743,-84.105,'Lima, OH',7.4 ],  [ 40.81,-96.675,'Lincoln, NE',3.1 ],  [ 34.746,-92.29,'Little Rock North Little Rock Conway, AR',4.7 ],  [ 32.501,-94.74,'Longview, TX',4.1 ],  [ 46.138,-122.938,'Longview, WA',8.7 ],  [ 34.052,-118.244,'Los Angeles Long Beach Anaheim, CA',7 ],  [ 33.578,-101.855,'Lubbock, TX',3.7 ],  [ 37.414,-79.142,'Lynchburg, VA',4.2 ],  [ 32.841,-83.632,'Macon, GA',6.3 ],  [ 36.961,-120.061,'Madera, CA',9.5 ],  [ 43.073,-89.401,'Madison, WI',3.7 ],  [ 39.184,-96.572,'Manhattan, KS',3.5 ],  [ 44.164,-93.999,'Mankato North Mankato, MN',4.4 ],  [ 40.758,-82.515,'Mansfield, OH',7.5 ],  [ 26.203,-98.23,'McAllen Edinburg Mission, TX',7.1 ],  [ 42.327,-122.876,'Medford, OR',7.9 ],  [ 37.302,-120.483,'Merced, CA',12.7 ],  [ 25.789,-80.204,'Miami Fort Lauderdale West Palm Beach, FL',5.5 ],  [ 41.708,-86.895,'Michigan City La Porte, IN',6.2 ],  [ 43.616,-84.247,'Midland, MI',6.1 ],  [ 31.997,-102.078,'Midland, TX',2.9 ],  [ 43.039,-87.906,'Milwaukee Waukesha West Allis, WI',5 ],  [ 46.862,-114.012,'Missoula, MT',5 ],  [ 30.695,-88.04,'Mobile, AL',5.7 ],  [ 37.639,-120.997,'Modesto, CA',11.1 ],  [ 32.509,-92.119,'Monroe, LA',5.2 ],  [ 41.916,-83.398,'Monroe, MI',8.6 ],  [ 32.367,-86.3,'Montgomery, AL',5.7 ],  [ 39.63,-79.956,'Morgantown, WV',3.1 ],  [ 36.214,-83.295,'Morristown, TN',7 ],  [ 48.421,-122.334,'Mount Vernon Anacortes, WA',6.1 ],  [ 40.193,-85.386,'Muncie, IN',6.7 ],  [ 43.234,-86.248,'Muskegon, MI',8.4 ],  [ 38.298,-122.287,'Napa, CA',5.2 ],  [ 26.142,-81.795,'Naples Immokalee Marco Island, FL',7.1 ],  [ 36.167,-86.783,'Nashville Davidson Murfreesboro Franklin, TN',5.8 ],  [ 35.108,-77.044,'New Bern, NC',6 ],  [ 29.951,-90.072,'New Orleans Metairie, LA',4.9 ],  [ 41.83,-86.254,'Niles Benton Harbor, MI',7.8 ],  [ 27.044,-82.236,'North Port Sarasota Bradenton, FL',7.3 ],  [ 29.187,-82.14,'Ocala, FL',8.1 ],  [ 39.278,-74.575,'Ocean City, NJ',7.9 ],  [ 31.846,-102.368,'Odessa, TX',3.4 ],  [ 41.223,-111.974,'Ogden Clearfield, UT',3.8 ],  [ 35.468,-97.516,'Oklahoma City, OK',3.8 ],  [ 47.038,-122.901,'Olympia Tumwater, WA',5.4 ],  [ 28.538,-81.379,'Orlando Kissimmee Sanford, FL',6.1 ],  [ 44.025,-88.543,'Oshkosh Neenah, WI',4.4 ],  [ 37.772,-87.111,'Owensboro, KY',5.9 ],  [ 34.198,-119.177,'Oxnard Thousand Oaks Ventura, CA',6.3 ],  [ 28.034,-80.589,'Palm Bay Melbourne Titusville, FL',6.7 ],  [ 30.159,-85.66,'Panama City, FL',5.7 ],  [ 39.267,-81.562,'Parkersburg Vienna, WV',4.8 ],  [ 30.421,-87.217,'Pensacola Ferry Pass Brent, FL',6 ],  [ 40.694,-89.589,'Peoria, IL',5.4 ],  [ 33.448,-112.074,'Phoenix Mesa Scottsdale, AZ',5.5 ],  [ 34.228,-92.003,'Pine Bluff, AR',7.6 ],  [ 40.441,-79.996,'Pittsburgh, PA',5.1 ],  [ 42.45,-73.245,'Pittsfield, MA',5.5 ],  [ 42.871,-112.446,'Pocatello, ID',4.8 ],  [ 27.273,-80.358,'Port St Lucie, FL',8.3 ],  [ 43.661,-70.255,'Portland South Portland, ME',4.3 ],  [ 34.54,-112.469,'Prescott, AZ',6.2 ],  [ 40.234,-111.659,'Provo Orem, UT',3.5 ],  [ 38.254,-104.609,'Pueblo, CO',6.1 ],  [ 26.93,-82.045,'Punta Gorda, FL',8.4 ],  [ 42.726,-87.783,'Racine, WI',5.8 ],  [ 35.78,-78.638,'Raleigh, NC',4.8 ],  [ 44.081,-103.231,'Rapid City, SD',3 ],  [ 40.336,-75.927,'Reading, PA',5.4 ],  [ 40.587,-122.392,'Redding, CA',10.1 ],  [ 39.53,-119.814,'Reno, NV',6.8 ],  [ 37.541,-77.436,'Richmond, VA',4.2 ],  [ 33.953,-117.396,'Riverside San Bernardino Ontario, CA',8.3 ],  [ 37.271,-79.941,'Roanoke, VA',3.9 ],  [ 44.023,-92.463,'Rochester, MN',4.7 ],  [ 43.161,-77.611,'Rochester, NY',5.6 ],  [ 42.271,-89.094,'Rockford, IL',8.6 ],  [ 35.938,-77.791,'Rocky Mount, NC',8.3 ],  [ 34.257,-85.165,'Rome, GA',6.5 ],  [ 38.582,-121.494,'Sacramento Roseville Arden Arcade, CA',7.1 ],  [ 43.419,-83.951,'Saginaw, MI',8.3 ],  [ 44.943,-123.035,'Salem, OR',6.4 ],  [ 36.678,-121.656,'Salinas, CA',8.5 ],  [ 40.761,-111.891,'Salt Lake City, UT',3.4 ],  [ 31.464,-100.437,'San Angelo, TX',4.1 ],  [ 29.424,-98.494,'San Antonio New Braunfels, TX',4.6 ],  [ 32.716,-117.161,'San Diego Carlsbad, CA',6.1 ],  [ 37.775,-122.419,'San Francisco Oakland Hayward, CA',5.7 ],  [ 37.339,-121.895,'San Jose Sunnyvale Santa Clara, CA',6.1 ],  [ 35.283,-120.66,'San Luis Obispo Paso Robles Arroyo Grande, CA',5.8 ],  [ 36.974,-122.031,'Santa Cruz Watsonville, CA',7.4 ],  [ 35.687,-105.938,'Santa Fe, NM',3.8 ],  [ 34.953,-120.436,'Santa Maria Santa Barbara, CA',5.5 ],  [ 38.44,-122.714,'Santa Rosa, CA',5.8 ],  [ 32.084,-81.1,'Savannah, GA',5.5 ],  [ 41.409,-75.662,'Scranton Wilkes Barre Hazleton, PA',6.1 ],  [ 47.606,-122.332,'Seattle Tacoma Bellevue, WA',4.5 ],  [ 27.816,-80.471,'Sebastian Vero Beach, FL',8.3 ],  [ 27.496,-81.441,'Sebring, FL',7.4 ],  [ 43.751,-87.715,'Sheboygan, WI',4.4 ],  [ 33.636,-96.609,'Sherman Denison, TX',5.1 ],  [ 32.525,-93.75,'Shreveport Bossier City, LA',5.5 ],  [ 31.546,-110.277,'Sierra Vista Douglas, AZ',5.8 ],  [ 43.545,-96.731,'Sioux Falls, SD',2.8 ],  [ 34.95,-81.932,'Spartanburg, SC',7.2 ],  [ 47.659,-117.426,'Spokane Spokane Valley, WA',6.2 ],  [ 39.782,-89.65,'Springfield, IL',5.6 ],  [ 37.209,-93.292,'Springfield, MO',5.3 ],  [ 39.924,-83.809,'Springfield, OH',6.7 ],  [ 45.558,-94.163,'St Cloud, MN',5.7 ],  [ 37.097,-113.568,'St George, UT',4.8 ],  [ 40.793,-77.86,'State College, PA',4.3 ],  [ 38.15,-79.072,'Staunton Waynesboro, VA',4 ],  [ 37.958,-121.291,'Stockton Lodi, CA',10.5 ],  [ 33.92,-80.341,'Sumter, SC',8.3 ],  [ 43.048,-76.147,'Syracuse, NY',5.6 ],  [ 30.438,-84.281,'Tallahassee, FL',4.9 ],  [ 27.951,-82.457,'Tampa St Petersburg Clearwater, FL',6.9 ],  [ 39.467,-87.414,'Terre Haute, IN',6.6 ],  [ 28.927,-82.004,'The Villages, FL',5.8 ],  [ 41.664,-83.555,'Toledo, OH',7.9 ],  [ 39.056,-95.689,'Topeka, KS',5.2 ],  [ 40.217,-74.743,'Trenton, NJ',4.7 ],  [ 32.222,-110.926,'Tucson, AZ',5.8 ],  [ 36.154,-95.993,'Tulsa, OK',3.7 ],  [ 33.21,-87.569,'Tuscaloosa, AL',5.1 ],  [ 32.351,-95.301,'Tyler, TX',4.7 ],  [ 21.301,-157.863,'Urban Honolulu, HI',3.9 ],  [ 43.101,-75.233,'Utica Rome, NY',5.6 ],  [ 30.833,-83.278,'Valdosta, GA',5.5 ],  [ 38.104,-122.257,'Vallejo Fairfield, CA',6.9 ],  [ 28.805,-97.004,'Victoria, TX',3.8 ],  [ 39.486,-75.026,'Vineland Bridgeton, NJ',7.9 ],  [ 36.33,-119.292,'Visalia Porterville, CA',10.9 ],  [ 31.549,-97.147,'Waco, TX',4.6 ],  [ 46.065,-118.343,'Walla Walla, WA',5.4 ],  [ 32.609,-83.638,'Warner Robins, GA',5.5 ],  [ 42.493,-92.343,'Waterloo Cedar Falls, IA',4.1 ],  [ 43.975,-75.911,'Watertown Fort Drum, NY',6.8 ],  [ 44.959,-89.63,'Wausau, WI',4.6 ],  [ 47.423,-120.31,'Wenatchee, WA',5.9 ],  [ 33.914,-98.493,'Wichita Falls, TX',4.7 ],  [ 37.689,-97.336,'Wichita, KS',4.5 ],  [ 41.241,-77.001,'Williamsport, PA',5.9 ],  [ 34.226,-77.945,'Wilmington, NC',5.3 ],  [ 36.104,-80.254,'Winston Salem, NC',6 ],  [ 46.602,-120.506,'Yakima, WA',7.3 ],  [ 39.963,-76.728,'York Hanover, PA',4.7 ],  [ 39.14,-121.617,'Yuba City, CA',12.2 ],  [ 32.693,-114.628,'Yuma, AZ',18.3 ]  ]; 