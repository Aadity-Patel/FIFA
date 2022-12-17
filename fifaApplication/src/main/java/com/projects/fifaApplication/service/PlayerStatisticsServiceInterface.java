package com.projects.fifaApplication.service;

import com.projects.fifaApplication.entity.PlayerStats;

import java.util.List;
import java.util.Optional;

public interface PlayerStatisticsServiceInterface{
    List<PlayerStats> findAllStats();
    Optional<PlayerStats> findByStatsId(Long id);

    List<PlayerStats> findByGamesPlayed(int games);

    List<PlayerStats> findByMinutes(int minutes);
    List<PlayerStats> findByGoalScore(int goals);
    List<PlayerStats> findByBirthYear(int  birthYear);

    PlayerStats saveStats(PlayerStats player);
}
