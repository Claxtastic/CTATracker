package net.thomasclaxton.ctatracker

import net.thomasclaxton.ctatracker.model.Line

object TrainConstants {
  val redStations = mapOf(
    "47th" to 41230,
    "63rd" to 40910,
    "69th" to 40990,
    "79th" to 40240,
    "87th" to 41430,
    "95th/Dan Ryan" to 40450,
    "Addison" to 41420,
    "Argyle" to 41200,
    "Belmont" to 41320,
    "Berwyn" to 41380,
    "Bryn Mawr" to 41380,
    "Cermak-Chinatown" to 41000,
    "Chicago" to 41450,
    "Clark/Division" to 40630,
    "Fullerton" to 41220,
    "Garfield" to 41170,
    "Granville" to 40760,
    "Harrison" to 41490,
    "Howard" to 40900,
    "Jackson" to 40560,
    "Jarvis" to 41190,
    "Lake" to 41660,
    "Lawrence" to 40700,
    "Loyola" to 41300,
    "Monroe" to 40770,
    "Morse" to 40100,
    "North/Clybourn" to 40650,
    "Roosevelt" to 41400,
    "Sheridan" to 40080,
    "Sox-35th" to 40190,
    "Thorndale" to 40880,
    "Wilson" to 40540
  )

  val blueStations = mapOf(
    "Addison" to 41240,
    "Austin" to 40010,
    "Belmont" to 40060,
    "California" to 40570,
    "Chicago" to 41410,
    "Cicero" to 40970,
    "Clark/Lake" to 40380,
    "Clinton" to 40430,
    "Cumberland" to 40230,
    "Damen" to 40590,
    "Division" to 40320,
    "Forest Park" to 40390,
    "Grand" to 40490,
    "Harlem (Forest Park)" to 40980,
    "Harlem (O'Hare)" to 40980,
    "Illinois Medical District" to 40810,
    "Irving Park" to 40550,
    "Jackson" to 40070,
    "Jefferson Park" to 41280,
    "Kedzie-Homan" to 40250,
    "LaSalle" to 41340,
    "Logan Square" to 41020,
    "Monroe" to 40790,
    "Montrose" to 41330,
    "O'Hare" to 40890,
    "Oak Park" to 4080,
    "Pulaski" to 40920,
    "Racine" to 40470,
    "Rosemont" to 40820,
    "UIC-Halsted" to 40350,
    "Washington" to 40370,
    "Western (Forest Park)" to 40220,
    "Western (O'Hare)" to 40670
  )

  val orangeStations = mapOf(
    "35th/Archer" to 40120,
    "Adams/Wabash" to 40680,
    "Ashland" to 41060,
    "Clark/Lake'" to 40380,
    "Halsted" to 41130,
    "Harold Washington Library-State/Van Buren" to 40850,
    "Kedzie" to 41150,
    "LaSalle/Van Buren" to 40160,
    "Midway" to 409830,
    "Pulaski" to 40960,
    "Quincy" to 40040,
    "Roosevelt" to 41400,
    "State/Lake" to 40260,
    "Washington/Wabash" to 41700,
    "Washington/Wells" to 40730,
    "Western" to 40310
  )

  val yellowStations = mapOf(
    "Dempster-Skokie" to 40140,
    "Howard" to 40900,
    "Oakton-Skokie" to 41680
  )

  val greenStations = mapOf(
    "35th-Bronzeville-IIT" to 41220,
    "43rd" to 41270,
    "51st" to 40130,
    "Adams/Wabash" to 40680,
    "Ashland" to 40170,
    "Ashland/63rd" to 40290,
    "Austin" to 41260,
    "California" to 41360,
    "Central" to 402800,
    "Cermak-McCormick Place" to 41690,
    "Cicero" to 40480,
    "Clark/Lake" to 40380,
    "Clinton" to 41160,
    "Conservatory-Central Park Drive" to 41670,
    "Cottage Grove" to 40720,
    "Garfield" to 40510,
    "Halsted" to 40940,
    "Harlem/Lake" to 40020,
    "Indiana" to 40300,
    "Kedzie" to 41070,
    "King Drive" to 41140,
    "Laramie" to 40700,
    "Morgan" to 41510,
    "Oak Park" to 41350,
    "Pulaski" to 40030,
    "Ridgeland" to 40610,
    "Roosevelt" to 41400,
    "State/Lake" to 40260,
    "Washington/Wabash" to 41700
  )

  val purpleStations = mapOf(
    "Adams/Wabash" to 40680,
    "Armitage" to 40660,
    "Belmont" to 41320,
    "Central" to 41250,
    "Chicago" to 40710,
    "Clark/Lake" to 40380,
    "Davis" to 40050,
    "Dempster" to 40690,
    "Diversey" to 40530,
    "Foster" to 40520,
    "Fullerton" to 41220,
    "Harold Washington Library-State/Van Buren" to 40850,
    "Howard" to 40900,
    "LaSalle/Van Buren" to 40160,
    "Linden" to 41070,
    "Main" to 40270,
    "Merchandise Mart" to 40460,
    "Noyes" to 40400,
    "Quincy" to 40040,
    "Sedgwick" to 40800,
    "South Boulevard" to 40840,
    "State/Lake" to 40260,
    "Washington/Wabash" to 41700,
    "Washington/Wells" to 40730,
    "Wellington" to 41210,
    "Wilson" to 40540
  )

  val pinkStations = mapOf(
    "18th" to 40830,
    "54th/Cermak" to 40580,
    "Adams/Wabash" to 40680,
    "Ashland" to 40170,
    "California" to 40440,
    "Central Park" to 40780,
    "Cicero" to 40420,
    "Clark/Lake" to 40380,
    "Clinton" to 41160,
    "Damen" to 40210,
    "Harold Washington Library-State/Van Buren" to 40850,
    "Kedzie" to 41040,
    "Kostner" to 40600,
    "LaSalle/Van Buren" to 40160,
    "Morgan" to 41510,
    "Polk" to 41030,
    "Pulaski" to 40150,
    "Quincy" to 40040,
    "State/Lake" to 40260,
    "Washington/Wabash" to 41700,
    "Washington/Wells" to 40730,
    "Western" to 40730
  )

  val brownStations = mapOf(
    "Adams/Wabash" to 40680,
    "Addison" to 41440,
    "Armitage" to 40660,
    "Belmont" to 41320,
    "Chicago" to 40710,
    "Clark/Lake" to 40380,
    "Damen" to 40090,
    "Diversey" to 40530,
    "Francisco" to 40870,
    "Fullerton" to 41220,
    "Harold Washington Library-State/Van Buren" to 40850,
    "Irving Park" to 41460,
    "Kedzie" to 41180,
    "Kimball" to 41290,
    "LaSalle/Van Buren" to 40160,
    "Merchandise Mart" to 40460,
    "Montrose" to 41500,
    "Paulina" to 41310,
    "Quincy" to 40040,
    "Rockwell" to 41010,
    "Sedgwick" to 40800,
    "Southport" to 40360,
    "State/Lake" to 40260,
    "Washington/Wabash" to 41700,
    "Washington/Wells" to 40730,
    "Wellington" to 41210,
    "Western" to 41480
  )

  val lines = listOf(
    Line("Red Line", "To Howard", "To 95th/Dan Ryan","#9E0A26"),
    Line("Blue Line", "To O'Hare", "To Forest Park", "#0181B2"),
    Line("Brown Line", "To Kimball", "To Loop", "#4E2B16"),
    Line("Green Line", "To Harlem/Lake", "To 63rd/Cottage Grove", "#007C2E"),
    Line("Orange Line", "To Loop", "To Midway", "#BA270F"),
    Line("Purple Line", "To Linden", "To Howard or Loop", "#421C7A"),
    Line("Pink Line", "To Loop", "To 54th/Cermak", "#771B40"),
    Line("Yellow Line", "To Dempster-Skokie" , "To Howard","#C7B525")
  )
}