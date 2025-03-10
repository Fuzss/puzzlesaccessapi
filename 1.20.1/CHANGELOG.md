# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [v20.1.1-1.20.1] - 2025-03-08
### Changed
- Lower required Forge version

## [v20.1.0-1.20.1] - 2025-03-07
- Port to Architectury Loom
### Changed
- Backport Access Widener contents from Puzzles Lib for Minecraft 1.21.4

## [v8.0.9-1.20.1] - 2024-01-24
- Bump version

## [v8.0.8-1.20.1] - 2024-01-24
### Fixed
- Update accesswidener to be transitive to fix reobfuscation issues

## [v8.0.7-1.20.1] - 2023-09-28
### Changed
- `BlockModelGenerators` and `ItemModelGenerators` accesses now include access to fields
### Fixed
- Fixed `BlockModelGenerators` extensions crashing on Forge

## [v8.0.6-1.20.1] - 2023-09-28
### Added
- Added access to `BlockModelGenerators` and `ItemModelGenerators` for using them as builders

## [v8.0.5-1.20.1] - 2023-06-30
### Changed
- Final cleanup

## [v8.0.4-1.20.1] - 2023-06-30
### Fixed
- Turn access widened methods transitive to fix remapping issue in development environment on Fabric

## [v8.0.3-1.20.1] - 2023-06-30
### Fixed
- Attempt to fix method remapping issue in development environment on Fabric

## [v8.0.2-1.20.1] - 2023-06-29
### Fixed
- Fixed compilation error due to issue with mappings

## [v8.0.1-1.20.1] - 2023-06-29
### Fixed
- Fixed start-up crash on both Forge and Fabric

## [v8.0.0-1.20.1] - 2023-06-27
- Initial release
