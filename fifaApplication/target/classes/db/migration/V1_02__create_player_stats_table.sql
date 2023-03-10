DROP TABLE IF EXISTS `player_stats`;
CREATE TABLE `player_stats` (
  `id` int NOT NULL AUTO_INCREMENT,
  `player` varchar(50) DEFAULT NULL,
  `position` varchar(50) DEFAULT NULL,
  `team` varchar(50) DEFAULT NULL,
  `age` varchar(50) DEFAULT NULL,
  `club` varchar(50) DEFAULT NULL,
  `birth_year` int DEFAULT NULL,
  `games` int DEFAULT NULL,
  `games_starts` int DEFAULT NULL,
  `minutes` int DEFAULT NULL,
  `minutes_90s` double DEFAULT NULL,
  `goals` int DEFAULT NULL,
  `assists` int DEFAULT NULL,
  `goals_pens` int DEFAULT NULL,
  `pens_made` int DEFAULT NULL,
  `pens_att` int DEFAULT NULL,
  `cards_yellow` int DEFAULT NULL,
  `cards_red` int DEFAULT NULL,
  `goals_per90` double DEFAULT NULL,
  `assists_per90` double DEFAULT NULL,
  `goals_assists_per90` double DEFAULT NULL,
  `goals_pens_per90` double DEFAULT NULL,
  `goals_assists_pens_per90` double DEFAULT NULL,
  `xg` double DEFAULT NULL,
  `npxg` double DEFAULT NULL,
  `xg_assist` double DEFAULT NULL,
  `npxg_xg_assist` double DEFAULT NULL,
  `xg_per90` double DEFAULT NULL,
  `xg_assist_per90` double DEFAULT NULL,
  `xg_xg_assist_per90` double DEFAULT NULL,
  `npxg_per90` double DEFAULT NULL,
  `npxg_xg_assist_per90` double DEFAULT NULL,
  PRIMARY KEY (`id`)
);